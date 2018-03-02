package com.team05.mapper;

import com.team05.domain.CheckManage;
import com.team05.utils.PageBean;

import java.util.List;

/**
 * Created by dllo on 18/2/28.
 */
public interface CheckManageMapper {
    Integer checkManagePage(PageBean<CheckManage> pageBean);

    List<CheckManage> selectAllCheck(PageBean<CheckManage> pageBean);

    List<String> selectAppType();

    List<String> selectEffectFlag();
}
