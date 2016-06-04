package tk.vantis.model;

import java.time.LocalDateTime;

/**
 * EveAccount
 * Created by Vantis on 2016/3/24.
 */
public class EveAccount extends BaseBean {
    private int id;
    private String account;
    private String password;
    private String token;
    private LocalDateTime tokenTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public LocalDateTime getTokenTime() {
        return tokenTime;
    }

    public void setTokenTime(LocalDateTime tokenTime) {
        this.tokenTime = tokenTime;
    }

    @Override
    public String toString() {
        return "EveAccount{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                ", tokenTime=" + tokenTime +
                '}';
    }
}
