package com.team05.service.impl;

import com.fasterxml.jackson.databind.deser.Deserializers;
import com.sun.xml.internal.xsom.impl.scd.Iterators;
import com.team05.domain.Satellite;
import com.team05.domain.base.BaseResult;
import com.team05.domain.base.Staff;
import com.team05.mapper.SatelliteMapper;
import com.team05.service.SatelliteService;
import com.team05.utils.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */
@Service("satelliteService")
public class SatelliteServiceImpl implements SatelliteService{
    @Resource
    private SatelliteMapper satelliteMapper;

    public BaseResult<Satellite> selectAllSatellite(Satellite satellite, int pageIndex, int pageSize) {
        BaseResult<Satellite> result = new BaseResult<Satellite>();

        PageBean<Satellite> pg = new PageBean<Satellite>(satellite);

        int totalCount = satelliteMapper.selectSatellitePage(pg);

        PageBean<Satellite> pageBean = new PageBean<Satellite>(pageIndex + 1, pageSize, totalCount);

        pageBean.setParameter(satellite);

        List<Satellite> satellites = satelliteMapper.selectAllSatellite(pageBean);

        result.setTotal(totalCount);
        result.setData(satellites);

        return result;
    }

    public BaseResult<Satellite> selectManageStaff(Satellite satellite, int pageIndex, int pageSize) {
        BaseResult<Satellite> result=new BaseResult<Satellite>();

        PageBean<Satellite> pg=new PageBean<Satellite>(satellite);

        int totalCount=satelliteMapper.selectManagePage(pg);

        PageBean<Satellite> pageBean=new PageBean<Satellite>(pageIndex+1,pageSize,totalCount);

        pageBean.setParameter(satellite);

        List<Satellite> satellites=satelliteMapper.selectManageStaff(pageBean);

        result.setTotal(totalCount);
        result.setData(satellites);

        return result;
    }

    public int deleteSatellite(String bimsStoreId ) {
        List<String> bimsStoreIdList= Arrays.asList(bimsStoreId.split(","));
        int count=satelliteMapper.deleteSatellite(bimsStoreIdList);
        return count;
    }
}
