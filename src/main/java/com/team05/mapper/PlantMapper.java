package com.team05.mapper;

import com.team05.domain.plant.Plant;
import com.team05.utils.PageBean;

import java.util.List;

/**
 * Created by dllo on 18/2/28.
 */
public interface PlantMapper {
    List<Plant> selectAllPlants(PageBean<Plant> pageBean);

    Integer selectPlantCount(PageBean<Plant> pageBean);

}
