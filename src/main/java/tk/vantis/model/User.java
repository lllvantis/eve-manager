package tk.vantis.model;

import java.util.List;

/**
 * EVE User
 * Created by Vantis on 2016/3/24.
 */

public class User {
    private long id;
    private String password;
    private List<EveAccount> eveAccountList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
