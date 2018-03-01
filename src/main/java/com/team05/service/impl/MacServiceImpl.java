package com.team05.service.impl;

import com.team05.domain.base.BaseResult;
import com.team05.domain.mac.Mac;
import com.team05.mapper.MacMapper;
import com.team05.service.MacService;
import com.team05.utils.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/26.
 */
@Service("macService")
public class MacServiceImpl implements MacService {

    @Resource
    private MacMapper macMapper;

    @Override
    public BaseResult<Mac> selectAllMac(Mac mac, int pageIndex, int pageSize) {
        BaseResult<Mac> result = new BaseResult<Mac>();

        PageBean<Mac> pg = new PageBean<Mac>(mac);

        int totalCount = macMapper.selectMacCount(pg);

        PageBean<Mac> pageBean = new PageBean<Mac>(pageIndex+1,pageSize,totalCount);

        pageBean.setParameter(mac);

        List<Mac> macs = macMapper.selectAllMacs(pageBean);

        result.setTotal(totalCount);
        result.setData(macs);

        return result;
    }

}
