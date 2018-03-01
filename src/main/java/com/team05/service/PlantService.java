package com.team05.service;

import com.team05.domain.base.BaseResult;
import com.team05.domain.plant.Plant;

/**
 * Created by dllo on 18/2/28.
 */
public interface PlantService {
    BaseResult<Plant> selectPlant(Plant plant,int pageIndex, int pageSize);
}
