package com.team05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
//    @RequestMapping(value = {"", "/"})
//    public String layout() {
//        return "layout";
//    }

//    @RequestMapping(value = "/welcome")
//    public String welcome(){
//        return "welcome";
//    }
//
//    @RequestMapping(value = "/index")
//    public String index(){
//        return "index";
//    }
    //end 2018.2.5 Kinjer 添加 实现layout，左侧menu，右侧内容的显示


    @RequestMapping(value = {"", "/"})
    public String login() {

        return "login";
    }


    @RequestMapping("/loginsubmit")
    public String layout(String username, String password) {

        System.out.println(username + ":" + password);

        return "layout";
    }


    @RequestMapping("/RightBody_Manage")
    public String manage(){

        return "RightBody_Manage";

    }




}
