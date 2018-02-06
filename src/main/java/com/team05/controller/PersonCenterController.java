package com.team05.controller;

import com.team05.domain.base.BaseResult;
import com.team05.domain.personcenter.PersonCenter;
import com.team05.service.PersonCenterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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

    @RequestMapping(value = "/showPCDetail")
    @ResponseBody
    public BaseResult<PersonCenter> showPCDetail(PersonCenter personCenter, int pageIndex, int pageSize){
        BaseResult<PersonCenter> result = personCenterService.personCenterResult(personCenter,pageIndex,pageSize);
        return result;
    }


}
