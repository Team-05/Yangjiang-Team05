package com.team05.service;

import com.team05.domain.CheckManage;
import com.team05.domain.base.BaseResult;

import java.util.List;

/**
 * Created by dllo on 18/2/28.
 */
public interface CheckManageService {
    BaseResult<CheckManage> selectAllCheck(CheckManage checkManage,int pageIndex,int pageSize);

    List<String> selectAppType();

    List<String> selectEffectType();
}
