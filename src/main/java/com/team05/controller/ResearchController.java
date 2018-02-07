package com.team05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dllo on 18/2/7.
 */
@Controller
@RequestMapping("/research")
public class ResearchController {

    @RequestMapping("/RightBody_Undertake")
    public String research(){
        return "RightBody_Undertake";
    }


}
