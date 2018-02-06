package com.team05.service;

import com.team05.domain.base.BaseResult;
import com.team05.domain.personcenter.PersonCenter;

/**
 * Created by dllo on 18/2/5.
 */
public interface PersonCenterService {
    BaseResult<PersonCenter> personCenterResult(PersonCenter personCenter, int pageIndex, int pageSize);
}
