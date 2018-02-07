package com.team05.service.impl;

import com.team05.domain.base.BaseResult;
import com.team05.domain.base.Department;
import com.team05.domain.base.Staff;
import com.team05.domain.personcenter.PersonCenter;
import com.team05.mapper.PersonCenterMapper;
import com.team05.service.PersonCenterService;
import com.team05.utils.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/5.
 */
@Service("personCenterService")
public class PersonCenterServiceImpl implements PersonCenterService{
    @Resource
    private PersonCenterMapper personCenterMapper;

    public BaseResult<PersonCenter> personCenterResult(PersonCenter personCenter, int pageIndex, int pageSize) {

        BaseResult<PersonCenter> result = new BaseResult<PersonCenter>();

        int totalCount = personCenterMapper.selectPCCount(personCenter);

        PageBean<PersonCenter> pageBean = new PageBean<PersonCenter>(pageIndex+1,pageSize,totalCount);

        pageBean.setParameter(personCenter);

        List<PersonCenter> personCenters = personCenterMapper.selectPersonCenterDetail(pageBean);

        result.setTotal(totalCount);
        result.setData(personCenters);

        return result;
    }


    public List<Staff> selectApplicant() {
        return personCenterMapper.selectApplicant();
    }


    public List<Department> selectDept() {
        return personCenterMapper.selectDept();
    }
}
