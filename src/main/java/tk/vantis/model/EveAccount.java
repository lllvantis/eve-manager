package tk.vantis.model;

/**
 * EveAccount
 * Created by Vantis on 2016/3/24.
 */
public class EveAccount extends BaseBean {
    String account;
    String password;
    String token;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
