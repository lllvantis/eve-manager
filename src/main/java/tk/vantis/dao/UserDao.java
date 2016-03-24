package tk.vantis.dao;

/**
 * UserDao
 * Created by Vantis on 2016/3/24.
 */
public class UserDao extends BaseDao {

    protected <T> T selectOneUser(String statement) {
        return super.selectOne(statement);
    }

    protected <T> T selectOne(String statement, Object parameter) {
        return super.selectOne(statement, parameter);
    }
}
