package com.team05.service.impl;

import com.team05.domain.base.BaseResult;
import com.team05.domain.base.Staff;
import com.team05.mapper.StaffMapper;
import com.team05.service.StaffService;
import com.team05.utils.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/8.
 */
@Service("staffService")
public class StaffServiceImpl implements StaffService{
    @Resource
    private StaffMapper staffMapper;

    public BaseResult<Staff> selectStaff(Staff staff, int pageIndex, int pageSize) {
        BaseResult<Staff> result = new BaseResult<Staff>();

        PageBean<Staff> pg = new PageBean<Staff>(staff);

        int totalCount = staffMapper.selectStaffCount(pg);

        PageBean<Staff> pageBean = new PageBean<Staff>(pageIndex+1,pageSize,totalCount);

        pageBean.setParameter(staff);

        List<Staff> staffs = staffMapper.selectStaffList(pageBean);

        result.setTotal(totalCount);
        result.setData(staffs);

        return result;
    }
}
