package com.team05.controller;

import com.team05.domain.base.BaseResult;
import com.team05.domain.base.Staff;
import com.team05.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by dllo on 18/2/6.
 */
@Controller
@RequestMapping(value="/project")
public class ProjectController {
    @Resource
    private StaffService staffService;

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

    //Kinjer 添加 2018.2.9 20:21
    //根据不同条件分页查询员工
    @RequestMapping(value = "/selectStaff")
    @ResponseBody
    public BaseResult<Staff> selectStaff(Staff staff, int pageIndex, int pageSize){
        BaseResult<Staff> staffs = staffService.selectStaff(staff,pageIndex,pageSize);
        return staffs;
    }

    //跳转到ManagerGridWindow页面
    @RequestMapping("/managerGridWindow")
    public String jumpToManagerGridWindow(){
        return "managergridwindow";
    }

}
