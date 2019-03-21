package com.satellite.system.service.impl;


import com.satellite.system.bean.TUser;
import com.satellite.system.enums.USER_PERMISSION;
import com.satellite.system.mapper.UserMapper;
import com.satellite.system.model.User;
import com.satellite.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 16:47 2018/7/21
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer login(String userName, String passWord) {

        Integer count = userMapper.countUser(userName,passWord);
        if(count!=null&&count>0){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public List<User> getAllUser() {
        List<TUser> users = userMapper.getAllUser();
        List<User> list = users.stream().map(tUser -> new User(tUser.getUsername(),tUser.getPassword(),USER_PERMISSION.getByStatus(tUser.getRole()).getDesc(),tUser.getCreate_time())).collect(Collectors.toList());
        return list;
    }

    @Override
    public Integer updateUser(TUser tUser) {
        Integer affect = userMapper.updateUser(tUser);
        return affect;
    }

    @Override
    public Integer deleteUser(String userName) {
        Integer affect = userMapper.deleteUser(userName);
        return affect;
    }

    @Override
    public Integer addUser(TUser user) {
        Integer affect =userMapper.addUser(user);
        return affect;
    }
}
