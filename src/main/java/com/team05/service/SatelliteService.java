package com.team05.service;

import com.team05.domain.Satellite;
import com.team05.domain.base.BaseResult;
import com.team05.domain.base.Staff;

/**
 * Created by dllo on 18/2/27.
 */
public interface SatelliteService {
    BaseResult<Satellite> selectAllSatellite(Satellite satellite, int pageIndex, int pageSize);

    BaseResult<Satellite> selectManageStaff(Satellite satellite,int pageIndex,int pageSize);
}
