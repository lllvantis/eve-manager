package tk.vantis.service;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.vantis.Constants;
import tk.vantis.dao.WebUserDao;
import tk.vantis.model.LoginWebUser;
import tk.vantis.model.WebUser;

import java.util.Map;

/**
 * Login相关操作
 * Created by Vantis on 2016/3/30.
 */
@Service
public class LoginService {

    @Autowired
    WebUserDao webUserDao;

    public WebUser login(Map<String, String> loginUser) {
        LoginWebUser md5edUser = new LoginWebUser(loginUser.get("loginUser"),
        new Md5Hash(loginUser.get("loginPassword"), loginUser.get("loginUser") + Constants
                .MD5_SALT, Constants.MD5_TIME).toString());
        return webUserDao.getAuthorizedUser(md5edUser);
    }

}
