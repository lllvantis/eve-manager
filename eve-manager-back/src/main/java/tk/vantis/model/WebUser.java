package tk.vantis.model;

import java.util.List;

/**
 * EVE User
 * Created by Vantis on 2016/3/24.
 */

public class WebUser extends BaseBean {
    private int id;
    private String userName;
    private String password;

    private List<EveAccount> eveAccountList;

    public WebUser() {

    }

    public WebUser(String userName, String password) {
        this.setUserName(userName);
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return userName;
    }

    public void setUserName(String user_name) {
        this.userName = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<EveAccount> getEveAccountList() {
        return eveAccountList;
    }

    public void setEveAccountList(List<EveAccount> eveAccountList) {
        this.eveAccountList = eveAccountList;
    }

    @Override
    public String toString() {
        return "WebUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", eveAccountList=" + eveAccountList +
                '}';
    }
}
