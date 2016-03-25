package tk.vantis.dao;

import org.springframework.stereotype.Component;
import tk.vantis.Constants;
import tk.vantis.model.EveAccount;
import tk.vantis.model.WebUser;

import java.util.List;

/**
 * EveAccountDao
 * Created by Vantis on 2016/3/24.
 */
@Component
public class EveAccountDao extends BaseDao {

    public List<EveAccount> getEveAccountList(WebUser webUser) {
        return selectList(Constants.DAO_NAME_SPACE_EVE_ACCOUNT, webUser);
    }
}
