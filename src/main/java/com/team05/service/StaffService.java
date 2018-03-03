package com.team05.service;

import com.team05.domain.base.BaseResult;
import com.team05.domain.base.Staff;

/**
 * Created by dllo on 18/2/8.
 */
public interface StaffService {
    BaseResult<Staff> selectStaff(Staff staff, int pageIndex, int pageSize);

}
