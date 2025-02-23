package com.xiao.service;

import com.xiao.common.R;
import com.xiao.dao.dto.CpcUser;

public interface CpcUserService {
    R<CpcUser> login(CpcUser user);
}
