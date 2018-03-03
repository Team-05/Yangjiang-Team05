package com.team05.controller;

import com.team05.domain.CheckManage;
import com.team05.domain.Satellite;
import com.team05.domain.SelectText;
import com.team05.domain.base.BaseResult;
import com.team05.domain.mac.Mac;
import com.team05.domain.plant.Plant;
import com.team05.service.MacService;
import com.team05.service.PlantService;

import com.team05.service.CheckManageService;
import com.team05.service.SatelliteService;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 18/2/6.
 */
@Controller
@RequestMapping(value = "/manage")
public class ManageController {

    @Resource
    private SatelliteService satelliteService;
    @Resource
    private CheckManageService checkManageService;

    @Resource
    private MacService macService;

    @Resource
    private PlantService plantService;

    @RequestMapping("/RightBody_Manage")
    public String manage(){
        return "RightBody_Manage";
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

    @RequestMapping(value = "/RightBody_Factory")
    public String rightBodyFactory(){
        return "RightBody_Factory";
    }


    @RequestMapping(value = "/MacApplicantWindow")
    public String macApplicantWindow(){
        return "MacApplicantWindow";
    }



    @RequestMapping(value = "/selectMac")
    @ResponseBody
    public BaseResult<Mac> selectAll(Mac mac, int pageIndex, int pageSize){
         BaseResult<Mac> macs = macService.selectAllMac(mac,pageIndex,pageSize);
        return macs;
    }


    @RequestMapping("/manageSatellite")
    public String manageSatellite(){
        return "manageSatellite";
    }

    //查询全部卫星库
    @RequestMapping(value="/selectAllSatellite")
    @ResponseBody
    public BaseResult<Satellite> selectAllSatellite(Satellite satellite, int pageIndex, int pageSize){
        BaseResult<Satellite> satellites = satelliteService.selectAllSatellite(satellite,pageIndex,pageSize);
        return satellites;
    }
    //删除卫星库
    @RequestMapping(value="deleteSatellite")
    @ResponseBody
    public void deleteSatellite(String bimsStoreId){
        satelliteService.deleteSatellite(bimsStoreId);
    }
    //查询管理人员
    @RequestMapping(value="/selectManageStaff")
    @ResponseBody
    public BaseResult<Satellite> selectManageStaff(Satellite satellite,int pageIndex,int pageSize){
        BaseResult<Satellite> satellites=satelliteService.selectManageStaff(satellite,pageIndex,pageSize);
        return satellites;
    }
    //综合查询
    @RequestMapping(value="selectAllCheck")
    @ResponseBody
    public BaseResult<CheckManage> selectAllCheck(CheckManage checkManage,int pageIndex,int pageSize){
        BaseResult<CheckManage> checkManages=checkManageService.selectAllCheck(checkManage,pageIndex,pageSize);
        return checkManages;
    }
    //查询流程类型
    @RequestMapping(value="/selectAppType")
    @ResponseBody
    public List<SelectText> selectAppType(){
        List<String> checkManages=checkManageService.selectAppType();
        List<SelectText> texts=new ArrayList<SelectText>();
        for (String checkManage : checkManages) {
            SelectText selectText = new SelectText(checkManage);
            texts.add(selectText);
        }
        return texts;
    }
    //查询是否打印
    @RequestMapping(value="/selectEffectFlag")
    @ResponseBody
    public List<SelectText> selectEffectFlag(){
        List<String> flag=checkManageService.selectEffectType();
        List<SelectText> texts=new ArrayList<SelectText>();
        for (String s : flag) {
            SelectText text=new SelectText(s);
            texts.add(text);
        }
        return texts;
    }

    @ResponseBody
    @RequestMapping("/selectPlant")
    public BaseResult<Plant> selectPlant(Plant plant, int pageIndex, int pageSize){
        BaseResult<Plant> result = plantService.selectPlant(plant,pageIndex,pageSize);
        return result;
    }

    @RequestMapping(value = "/PlantApplicantWindow")
    public String plantApplicantWindow(){
        return "PlantApplicantWindow";
    }

    @RequestMapping(value = "/PlantWindow")
    public String plantWindow(){
        return "PlantWindow";
    }


}
