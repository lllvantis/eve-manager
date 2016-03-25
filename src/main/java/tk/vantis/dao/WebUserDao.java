package tk.vantis.dao;

import org.springframework.stereotype.Component;
import tk.vantis.Constants;
import tk.vantis.model.WebUser;

import java.util.HashMap;

/**
 * UserDao
 * Created by Vantis on 2016/3/24.
 */
@Component
public class WebUserDao extends BaseDao {

    public WebUser getUser(int Id) {
        return selectOne(Constants.DAO_NAME_SPACE_WEB_USER + "web_get_user", Id);
    }

    public WebUser getAuthorizedUser(HashMap<String, String> webLabelParameter) {
        return selectOne(Constants.DAO_NAME_SPACE_WEB_USER + "web_check_user", webLabelParameter);
    }

    public void updateUser(WebUser webUser) {
        updateOne(Constants.DAO_NAME_SPACE_WEB_USER + "web_update_user", webUser);
    }

    public void deleteUser(WebUser webUser) {
        deleteOne(Constants.DAO_NAME_SPACE_WEB_USER + "web_delete_user", webUser);
    }

    public void addUser(WebUser webUser) {
        addOne(Constants.DAO_NAME_SPACE_WEB_USER + "web_add_user", webUser);
    }
}
