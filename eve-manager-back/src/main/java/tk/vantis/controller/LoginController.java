package tk.vantis.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.vantis.model.WebUser;
import tk.vantis.service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * LoginController
 * Created by Vantis on 2016/3/30.
 */
@RestController
public class LoginController {

    private static Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "login.do", method = RequestMethod.GET)
    public void login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        HashMap<String, String> loginUser = new HashMap<>();
        loginUser.put("loginUser", httpServletRequest.getParameter("user_name"));
        loginUser.put("loginPassword", httpServletRequest.getParameter("password"));
        WebUser authorizedUser = loginService.login(loginUser);
        if (null == authorizedUser) {
            logger.debug(httpServletRequest.getParameter("user_name") + ": 尝试登录失败.");
            PrintWriter printWriter = null;
            try {
                httpServletResponse.setContentType("text/xml;charset=utf-8");
                printWriter = httpServletResponse.getWriter();
                //TODO 测试ing
                printWriter.write("test");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(null != printWriter) {
                    printWriter.close();
                }
            }
        } else {

        }
    }
}
