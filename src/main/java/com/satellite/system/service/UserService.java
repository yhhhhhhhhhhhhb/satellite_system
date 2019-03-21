package com.satellite.system.service;



import com.satellite.system.bean.TUser;
import com.satellite.system.model.User;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 16:42 2018/7/21
 * @Modified By:
 */
public interface UserService {

    Integer login(String userName,String passWord);

    Integer updateUser(TUser tUser);

    List<User> getAllUser();

    Integer deleteUser(String userName);

    Integer addUser(TUser user);

}
