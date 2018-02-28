package com.team05.mapper;

import com.team05.domain.RayUser;
import com.team05.utils.PageBean;

import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */
public interface RayUserMapper {
    Integer selectRayUserCount(PageBean<RayUser> pageBean);

    List<RayUser> selectRayUserDetail(PageBean<RayUser> pageBean);

    Integer deleteRayUser(List<String> rayStaffIdList);
}
