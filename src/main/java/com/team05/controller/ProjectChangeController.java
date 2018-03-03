package com.team05.controller;

import com.team05.domain.ProjectChange;
import com.team05.service.ProjectChangeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by dllo on 18/3/2.
 */
@Controller
@RequestMapping(value = "/projectChange")
public class ProjectChangeController {

    @Resource
    private ProjectChangeService projectChangeService;

    @RequestMapping(value = "/insertProChange")
    @ResponseBody
    public int insertProChange(ProjectChange projectChange){

        int count = projectChangeService.insertProChange(projectChange);
        return count;

    }

}
