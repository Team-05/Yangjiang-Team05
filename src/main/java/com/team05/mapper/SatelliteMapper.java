package com.team05.mapper;

import com.sun.scenario.effect.impl.state.AccessHelper;
import com.team05.domain.Satellite;
import com.team05.utils.PageBean;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */
public interface SatelliteMapper {

    Integer selectSatellitePage(PageBean<Satellite> pageBean);

    Integer selectManagePage(PageBean<Satellite> pageBean);

    List<Satellite> selectAllSatellite(PageBean<Satellite> pageBean);

    List<Satellite> selectManageStaff(PageBean<Satellite> pageBean);

    Integer deleteSatellite(List<String> bimsStoreIdList);
}
