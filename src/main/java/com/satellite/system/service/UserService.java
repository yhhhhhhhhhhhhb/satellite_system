package com.satellite.system.service;



import com.satellite.system.bean.TUser;

import java.util.List;
import java.util.Map;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 16:42 2018/7/21
 * @Modified By:
 */
public interface UserService {

    TUser getUserById(Integer id);

    List<TUser> getUserList();

    int add(TUser user);

    int update(TUser user);

    List<Map<String,Object>> getListMyName(String name);
}
