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
    public BaseResult<Staff> selectApplicant(Staff staff, int pageIndex, int pageSize){
        BaseResult<Staff> staffs = personCenterService.selectApplicant(staff,pageIndex,pageSize);
        return staffs;
    }

    @RequestMapping(value = "/selectDept")
    @ResponseBody
    public BaseResult<Department> selectDept(Department department, int pageIndex, int pageSize){
        BaseResult<Department> departments = personCenterService.selectDept(department,pageIndex,pageSize);
        return departments;
    }
    //End 添加 查询员工和部门列表 Kinjer 2018.2.6 18：00

}
