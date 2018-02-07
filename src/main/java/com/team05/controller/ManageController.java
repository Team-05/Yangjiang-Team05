package com.team05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dllo on 18/2/6.
 */
@Controller
@RequestMapping(value = "/manage")
public class ManageController {

    @RequestMapping("/RightBody_Manage")
    public String manage(){
        return "RightBody_Manage";
    }

    @RequestMapping("/RightBody_Factory")
    public String factory(){
        return "RightBody_Factory";
    }

    @RequestMapping("/check_manage")
    public String check(){
        return "check_manage";
    }

    @RequestMapping("/satellite_manage")
    public String satellite(){
        return "satellite_manage";
    }
}
