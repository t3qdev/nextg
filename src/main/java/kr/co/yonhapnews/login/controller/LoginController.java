package kr.co.yonhapnews.login.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.yonhapnews.common.authentication.CustomUserDetails;


@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public void login(HttpSession session) {
        logger.info("Welcome login! {}", session.getId());
    }

    @RequestMapping(value = "loginSuccess", method = RequestMethod.GET)
    public void loginSuccess(HttpSession session) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getDetails();

        logger.info("Welcome login success! {}, {}", session.getId(), userDetails.getUsername() + "/"
                + userDetails.getPassword());

        session.setAttribute("userDetails", userDetails);
    }

    @RequestMapping(value = "logoutSuccess", method = RequestMethod.GET)
    public void logoutSuccess(HttpSession session) {
        CustomUserDetails userDetails = (CustomUserDetails) session.getAttribute("userDetails");

        logger.info("Welcome logout! {}, {}", session.getId(), userDetails);
    }

    @RequestMapping(value = "page1", method = RequestMethod.GET)
    public void page1() {
    }

    @RequestMapping(value = "loginDuplicate", method = RequestMethod.GET)
    public void loginDuplicate() {
        logger.info("Welcome login duplicate!");
    }

    @RequestMapping(value = "denied", method = RequestMethod.GET)
    public void denied() {
        logger.info("Access Denied!");
    }

}
