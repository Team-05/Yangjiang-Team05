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

        PageBean<PersonCenter> pg = new PageBean<PersonCenter>(personCenter);

        int totalCount = personCenterMapper.selectPCCount(pg);

        PageBean<PersonCenter> pageBean = new PageBean<PersonCenter>(pageIndex+1,pageSize,totalCount);

        pageBean.setParameter(personCenter);

        List<PersonCenter> personCenters = personCenterMapper.selectPersonCenterDetail(pageBean);

        result.setTotal(totalCount);
        result.setData(personCenters);

        return result;
    }

    public BaseResult<Staff> selectApplicant(Staff staff, int pageIndex, int pageSize) {
        BaseResult<Staff> result = new BaseResult<Staff>();

        PageBean<Staff> pg = new PageBean<Staff>(staff);

        int totalCount = personCenterMapper.selectApplicantCount(pg);

        PageBean<Staff> pageBean = new PageBean<Staff>(pageIndex+1,pageSize,totalCount);

        pageBean.setParameter(staff);

        List<Staff> staffs = personCenterMapper.selectApplicant(pageBean);

        result.setTotal(totalCount);
        result.setData(staffs);

        return result;
    }

    public BaseResult<Department> selectDept(Department department, int pageIndex, int pageSize) {
        BaseResult<Department> result = new BaseResult<Department>();

        PageBean<Department> pg = new PageBean<Department>(department);

        int totalCount = personCenterMapper.selectDeptCount(pg);

        PageBean<Department> pageBean = new PageBean<Department>(pageIndex+1,pageSize,totalCount);

        pageBean.setParameter(department);

        List<Department> personCenters = personCenterMapper.selectDept(pageBean);

        result.setTotal(totalCount);
        result.setData(personCenters);

        return result;
    }


}
