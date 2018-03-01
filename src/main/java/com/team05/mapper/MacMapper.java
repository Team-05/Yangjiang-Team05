package com.team05.mapper;

import com.team05.domain.mac.Mac;
import com.team05.utils.PageBean;

import java.util.List;

/**
 * Created by dllo on 18/2/26.
 */
public interface MacMapper {

    // 查询所有机组信息
    List<Mac> selectAllMacs(PageBean<Mac> pageBean);
    // 所有机组条数
    Integer selectMacCount(PageBean<Mac> pageBean);

    // 查询所有机组管理员
    Integer selectManageCount(PageBean<Mac> pageBean);

    List<Mac> selectManage(PageBean<Mac> pageBean);



}
