package com.team05.service;

import com.team05.domain.base.BaseResult;
import com.team05.domain.mac.Mac;

/**
 * Created by dllo on 18/2/26.
 */
public interface MacService {

    BaseResult<Mac> selectAllMac(Mac mac, int pageIndex, int pageSize);



}
