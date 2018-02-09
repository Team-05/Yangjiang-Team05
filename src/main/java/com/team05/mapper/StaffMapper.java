package com.team05.mapper;

import com.team05.domain.base.Staff;
import com.team05.utils.PageBean;

import java.util.List;

/**
 * Created by dllo on 18/2/7.
 */
public interface StaffMapper {
    Staff selectByName(String username);

    //Start Kinjer 添加 根据不同条件分页查询员工 2018.2.9 20:21
    Integer selectStaffCount(PageBean<Staff> pageBean);

    List<Staff> selectStaffList(PageBean<Staff> pageBean);
    //End Kinjer 添加 根据不同条件分页查询员工 2018.2.9 20:21
}
