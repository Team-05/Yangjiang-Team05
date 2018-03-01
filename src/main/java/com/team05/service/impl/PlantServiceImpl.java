package com.team05.service.impl;

import com.team05.domain.base.BaseResult;
import com.team05.domain.plant.Plant;
import com.team05.mapper.PlantMapper;
import com.team05.service.PlantService;
import com.team05.utils.PageBean;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/28.
 */
public class PlantServiceImpl implements PlantService{

    @Resource
    private PlantMapper plantMapper;

    @Override
    public BaseResult<Plant> selectPlant(Plant plant, int pageIndex, int pageSize) {
        BaseResult<Plant> result = new BaseResult<Plant>();

        PageBean<Plant> pg = new PageBean<Plant>(plant);

        int totalCount = plantMapper.selectPlantCount(pg);

        PageBean<Plant> pageBean = new PageBean<Plant>(pageIndex+1,pageSize,totalCount);

        pageBean.setParameter(plant);

        List<Plant> plants = plantMapper.selectAllPlants(pageBean);

        result.setTotal(totalCount);
        result.setData(plants);

        return result;
    }
}
