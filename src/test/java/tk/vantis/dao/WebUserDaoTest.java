package tk.vantis.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

/**
 * Web User Dao Test
 * Created by Vantis on 2016/3/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        ""
})
public class WebUserDaoTest {

    private static ApplicationContext applicationContext;


    @Test
    public void getAuthorizedUser() throws Exception {
        HashMap<String, String> testWebLabelParameter = new HashMap<>();
        testWebLabelParameter.put("user_name", "vantis");
        testWebLabelParameter.put("password", "test");

    }

}