package com.team05.service.impl;

import com.team05.domain.ProjectChange;
import com.team05.mapper.ProjectChangeMapper;
import com.team05.service.ProjectChangeService;
import com.team05.utils.CommonUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dllo on 18/3/2.
 */
@Service("projectChangeService")
public class ProjectChangeServiceImpl implements ProjectChangeService{
    @Resource
    private ProjectChangeMapper projectChangeMapper;

    public Integer insertProChange(ProjectChange projectChange) {
        String pmsChange = CommonUtils.uuid();
        projectChange.setPmsChange(pmsChange);

        int count = projectChangeMapper.insertProChange(projectChange);
        return count;
    }
}
