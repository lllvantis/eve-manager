package tk.vantis.model;

/**
 * loginUser
 * Created by Vantis on 2016/3/30.
 */
public class LoginWebUser {

    private String userName;
    private String password;

    public LoginWebUser(String loginUser, String password) {
        this.userName = loginUser;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
