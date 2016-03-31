package tk.vantis.dao;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.vantis.model.WebUser;

/**
 * Web User Dao Test
 * Created by Vantis on 2016/3/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath*:applicationContext.xml"
})
public class WebUserDaoTest {
    private Logger logger = Logger.getLogger(getClass());

    @Autowired
    WebUserDao webUserDao;

    @Test
    public void getAuthorizedUser() throws Exception {

    }

    @Test
    public void getUser() throws Exception {

    }

    @Test
    public void updateUser() throws Exception {

    }

    @Test
    public void deleteUser() throws Exception {

    }

    @Test
    public void addUser() throws Exception {
        WebUser webUser = new WebUser("vantis", "test");
        webUser.setCreator("vantis");
        webUserDao.addUser(webUser);
    }
}
