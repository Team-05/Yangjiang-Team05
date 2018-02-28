package com.team05.service;

import com.team05.domain.RayUser;
import com.team05.domain.base.BaseResult;

/**
 * Created by dllo on 18/2/27.
 */
public interface RayUserService {
    BaseResult<RayUser> rayUserResult(RayUser rayUser, int pageIndex, int pageSize);

    int deleteRayUser(String rayStaffId);
}
