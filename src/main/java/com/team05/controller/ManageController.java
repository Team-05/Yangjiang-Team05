package com.team05.controller;

import com.team05.domain.base.BaseResult;
import com.team05.domain.mac.Mac;
import com.team05.service.MacService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by dllo on 18/2/6.
 */
@Controller
@RequestMapping(value = "/manage")
public class ManageController {

    @Resource
    private MacService macService;

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

}
