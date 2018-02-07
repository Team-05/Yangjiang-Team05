package com.team05.mapper;

import com.team05.domain.base.Staff;

/**
 * Created by dllo on 18/2/7.
 */
public interface StaffMapper {
    Staff selectByName(String username);
}
