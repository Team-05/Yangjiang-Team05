package com.team05.service;

import com.team05.domain.base.BaseResult;
import com.team05.domain.base.Department;
import com.team05.domain.base.Staff;
import com.team05.domain.personcenter.PersonCenter;

import java.util.List;

/**
 * Created by dllo on 18/2/5.
 */
public interface PersonCenterService {
    BaseResult<PersonCenter> personCenterResult(PersonCenter personCenter, int pageIndex, int pageSize);

    List<Staff> selectApplicant();

    List<Department> selectDept();
}
