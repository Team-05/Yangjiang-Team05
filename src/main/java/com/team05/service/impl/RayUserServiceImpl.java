package com.team05.service.impl;

import com.team05.domain.RayUser;
import com.team05.domain.base.BaseResult;
import com.team05.mapper.RayUserMapper;
import com.team05.service.RayUserService;
import com.team05.utils.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */
@Service("rayUserService")
public class RayUserServiceImpl implements RayUserService{

    @Resource
    private RayUserMapper rayUserMapper;

    public BaseResult<RayUser> rayUserResult(RayUser rayUser, int pageIndex, int pageSize) {
        BaseResult<RayUser> result = new BaseResult<RayUser>();

        PageBean<RayUser> pg = new PageBean<RayUser>(rayUser);

        int totalCount = rayUserMapper.selectRayUserCount(pg);

        PageBean<RayUser> pageBean = new PageBean<RayUser>(pageIndex+1,pageSize,totalCount);

        pageBean.setParameter(rayUser);

        List<RayUser> personCenters = rayUserMapper.selectRayUserDetail(pageBean);

        result.setTotal(totalCount);
        result.setData(personCenters);

        return result;
    }
}
