package com.team05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dllo on 18/2/6.
 */
@Controller
@RequestMapping(value="/project")
public class ProjectController {
    @RequestMapping("/project_apply")
    public String apply(){
        return "project_apply";
    }

    @RequestMapping("/project_examine")
    public String examine(){
        return "project_examine";
    }

    @RequestMapping("/project_manager")
    public String manager(){
        return "project_manager";
    }
}
