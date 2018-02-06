package com.team05.mapper;

import com.team05.domain.base.Department;
import com.team05.domain.base.Staff;
import com.team05.domain.personcenter.PersonCenter;
import com.team05.utils.PageBean;

import java.util.List;

/**
 * Created by dllo on 18/2/5.
 */
public interface PersonCenterMapper {
    List<PersonCenter> selectPersonCenterDetail(PageBean<PersonCenter> pageBean);

    Integer selectPCCount(PersonCenter personCenter);

    List<Staff> selectApplicant();

    List<Department> selectDept();
}
