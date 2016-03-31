package tk.vantis.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tk.vantis.model.WebUser;
import tk.vantis.service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * LoginController
 * Created by Vantis on 2016/3/30.
 */
@Controller
@RequestMapping(value = "/login.do")
public class LoginController {

    private static Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public void login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        HashMap<String, String> loginUser = new HashMap<>();
        loginUser.put("loginUser", httpServletRequest.getParameter("user_name"));
        loginUser.put("loginPassword", httpServletRequest.getParameter("password"));
        WebUser authorizedUser = loginService.login(loginUser);
        if (null == authorizedUser) {

        } else {

        }
    }
}
