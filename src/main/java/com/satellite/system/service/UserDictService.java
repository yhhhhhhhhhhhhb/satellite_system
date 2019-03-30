package com.satellite.system.service;

import com.satellite.system.bean.TUser;
import com.satellite.system.bean.TUserDict;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 12:45 2019/3/30
 * @Modified By:
 */
public interface UserDictService {

    boolean isExitToken(String token);

    Integer addToken(TUserDict tUserDict);

    Integer deleteUserDict(String userName);

    TUserDict getToken(String token);

    Integer deleteBytime(String time);
}
