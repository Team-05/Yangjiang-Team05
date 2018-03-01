package com.team05.service.impl;

import com.team05.domain.CheckManage;
import com.team05.domain.base.BaseResult;
import com.team05.domain.personcenter.PersonCenter;
import com.team05.mapper.CheckManageMapper;
import com.team05.service.CheckManageService;
import com.team05.utils.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/28.
 */
@Service("checkManageService")
public class CheckManageServiceImpl implements CheckManageService {
    @Resource
    private CheckManageMapper checkManageMapper;

    public BaseResult<CheckManage> selectAllCheck(CheckManage checkManage, int pageIndex, int pageSize) {
        BaseResult<CheckManage> result = new BaseResult<CheckManage>();

        PageBean<CheckManage> pg = new PageBean<CheckManage>(checkManage);

        int totalCount = checkManageMapper.checkManagePage(pg);

        PageBean<CheckManage> pageBean = new PageBean<CheckManage>(pageIndex+1,pageSize,totalCount);

        pageBean.setParameter(checkManage);

        List<CheckManage> checkManages = checkManageMapper.selectAllCheck(pageBean);

        result.setTotal(totalCount);
        result.setData(checkManages);

        return result;
    }

    public List<String> selectAppType() {
        List<String> checkManages=checkManageMapper.selectAppType();
        return checkManages;
    }

    public List<String> selectEffectType() {
        List<String> flag=checkManageMapper.selectEffectFlag();
        return flag;
    }
}
