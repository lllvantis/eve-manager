package tk.vantis.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * BaseDao
 * Created by Vantis on 2016/3/24.
 */
public abstract class BaseDao {

    @Autowired
    private SqlSessionTemplate readOnlySessionTemplate;

    @Autowired
    private SqlSessionTemplate editableSessionTemplate;

    protected <T> T selectOne(String statement) {
        return readOnlySessionTemplate.selectOne(statement);
    }

    protected <T> T selectOne(String statement, Object parameter) {
        return readOnlySessionTemplate.selectOne(statement, parameter);
    }

    protected void updateOne(String statement) {
        editableSessionTemplate.update(statement);
    }
    protected void updateOne(String statement, Object parameter) {
        editableSessionTemplate.update(statement, parameter);
    }
}
