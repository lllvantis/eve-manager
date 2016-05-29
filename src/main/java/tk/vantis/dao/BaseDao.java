package tk.vantis.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * BaseDao
 * Created by Vantis on 2016/3/24.
 */

@Component
public abstract class BaseDao {

    @Autowired
    private SqlSessionTemplate readOnlySqlSessionTemplate;

    @Autowired
    private SqlSessionTemplate writableSqlSessionTemplate;

    protected <T> T selectOne(String statement) {
        return readOnlySqlSessionTemplate.selectOne(statement);
    }

    protected <T> T selectOne(String statement, Object parameter) {
        return readOnlySqlSessionTemplate.selectOne(statement, parameter);
    }

    protected <E> List<E> selectList(String statement) {
        return readOnlySqlSessionTemplate.selectList(statement);
    }

    protected <E> List<E> selectList(String statement, Object parameter) {
        return readOnlySqlSessionTemplate.selectList(statement, parameter);
    }

    protected void updateOne(String statement, Object parameter) {
        writableSqlSessionTemplate.update(statement, parameter);
    }

    protected void deleteOne(String statement, Object parameter) {
        writableSqlSessionTemplate.delete(statement, parameter);
    }

    protected void addOne(String statement, Object parameter) {
        writableSqlSessionTemplate.insert(statement, parameter);
    }
}
