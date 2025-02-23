package service;

import com.xiao.common.R;
import com.xiao.dao.dto.CpcUser;
import org.springframework.stereotype.Service;

public interface CpcUserService {
    R<CpcUser> login(CpcUser user);
}
