package com.team05.controller;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by dllo on 18/2/3.
 */
@Controller
public class MainController {
    //2018.2.5 Kinjer 移除
//    @RequestMapping(value = {"", "/"})
//    public String index() {
//        return "index";
//    }

    //start 2018.2.5 Kinjer 添加 实现layout，左侧menu，右侧内容的显示
    @RequestMapping(value = {"", "/"})
    public String layout() {
        return "layout";
    }

    @RequestMapping(value = "/welcome")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
    //end 2018.2.5 Kinjer 添加 实现layout，左侧menu，右侧内容的显示


    //start 2018.2.5 wkingboss 添加权限认证登录
    //登录表单验证
    @RequestMapping(value = "/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/loginsubmit")
    public ModelAndView loginsubmit(HttpServletRequest request) throws Exception {
        String error = null;
        String exClassName = (String) request.getAttribute("shiroLoginFailure");
        if (UnknownAccountException.class.getName().equals(exClassName)) {
            error = "用户不存在";
        } else if (IncorrectCredentialsException.class.getName().equals(exClassName)) {
            error = "密码不正确";
        } else {
            error = "未知错误:" + exClassName;
        }
        ModelAndView mav=new ModelAndView("login");
        mav.addObject("error", error);
        return mav;
    }
}
