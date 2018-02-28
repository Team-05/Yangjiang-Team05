package com.team05.controller;

import com.team05.domain.RayUser;
import com.team05.domain.base.BaseResult;
import com.team05.service.RayUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by dllo on 18/2/27.
 */
@Controller
@RequestMapping(value = "/rayUser")
public class RayUserController {
    @Resource
    private RayUserService rayUserService;

    @RequestMapping(value = "/showRayUserDetail")
    @ResponseBody
    public BaseResult<RayUser> showRayUserDetail(RayUser rayUser, int pageIndex, int pageSize){
        BaseResult<RayUser> result = rayUserService.rayUserResult(rayUser,pageIndex,pageSize);
        return result;
    }

    @RequestMapping(value = "/deleteRayUser")
    public void deleteRayUser(String rayStaffId){
        rayUserService.deleteRayUser(rayStaffId);
    }

    @RequestMapping(value = "/addRayUserGw")
    public String addRayUserGw(){
        return "add_rayuser_gw";
    }
}
