package com.team05.controller;

import com.team05.domain.Satellite;
import com.team05.domain.base.BaseResult;
import com.team05.domain.base.Staff;
import com.team05.service.SatelliteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/6.
 */
@Controller
@RequestMapping(value = "/manage")
public class ManageController {

    @Resource
    private SatelliteService satelliteService;

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

    @RequestMapping("/RightBody_Hurt")
    public String rightBodyHurt() {
        return "RightBody_Hurt";
    }

    @RequestMapping("/manageSatellite")
    public String manageSatellite(){
        return "manageSatellite";
    }

    //查询全部卫星库
    @RequestMapping(value="/selectAllSatellite")
    @ResponseBody
    public BaseResult<Satellite> selectAllSatellite(Satellite satellite,int pageIndex,int pageSize){
        BaseResult<Satellite> satellites = satelliteService.selectAllSatellite(satellite,pageIndex,pageSize);
        return satellites;
    }
    //查询管理人员
    @RequestMapping(value="/selectManageStaff")
    @ResponseBody
    public BaseResult<Satellite> selectManageStaff(Satellite satellite,int pageIndex,int pageSize){
        BaseResult<Satellite> satellites=satelliteService.selectManageStaff(satellite,pageIndex,pageSize);
        return satellites;
    }
}
