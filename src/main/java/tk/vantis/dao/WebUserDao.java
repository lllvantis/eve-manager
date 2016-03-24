package tk.vantis.dao;

import org.springframework.stereotype.Component;
import tk.vantis.Constants;

import java.util.HashMap;

/**
 * UserDao
 * Created by Vantis on 2016/3/24.
 */
@Component
public class WebUserDao extends BaseDao {

    protected <T> T getUser(int Id) {
        return selectOne(Constants.DAO_NAME_SPACE_WEB_USER + "web_get_user", Id);
    }

    protected <T> T getAuthorizedUser(HashMap<String, String> webLabelParameter) {
        return selectOne(Constants.DAO_NAME_SPACE_WEB_USER + "web_check_user", webLabelParameter);
    }
}
