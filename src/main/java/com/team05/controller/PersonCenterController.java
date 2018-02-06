package com.team05.controller;

import com.team05.domain.base.BaseResult;
import com.team05.domain.base.Department;
import com.team05.domain.base.Staff;
import com.team05.domain.personcenter.PersonCenter;
import com.team05.service.PersonCenterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/5.
 */
@Controller
@RequestMapping(value = "/person_center")
public class PersonCenterController {
    @Resource
    private PersonCenterService personCenterService;

    @RequestMapping(value = "/showPerson_center")
    public String showPCPage(){
        return "person_center";
    }

    @RequestMapping(value = "/deptGridWindow")
    public String deptGridWindow(){
        return "deptgridwindow";
    }

    @RequestMapping(value = "/applicantGridWindow")
    public String applicantGridWindow(){
        return "applicantgridwindow";
    }

    @RequestMapping(value = "/showPCDetail")
    @ResponseBody
    public BaseResult<PersonCenter> showPCDetail(PersonCenter personCenter, int pageIndex, int pageSize){
        BaseResult<PersonCenter> result = personCenterService.personCenterResult(personCenter,pageIndex,pageSize);
        return result;
    }

    //Start 添加 查询员工和部门列表 Kinjer 2018.2.6 18：00
    @RequestMapping(value = "/selectApplicant")
    @ResponseBody
    public List<Staff> selectApplicant(){
        List<Staff> staffs = personCenterService.selectApplicant();
        return staffs;
    }

    @RequestMapping(value = "/selectDept")
    @ResponseBody
    public List<Department> selectDept(){
        List<Department> departments = personCenterService.selectDept();
        return departments;
    }
    //End 添加 查询员工和部门列表 Kinjer 2018.2.6 18：00

}
