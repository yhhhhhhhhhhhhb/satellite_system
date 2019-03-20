package com.satellite.system.service.impl;


import com.satellite.system.bean.TUser;
import com.satellite.system.mapper.UserMapper;
import com.satellite.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
    public TUser getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<TUser> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int add(TUser user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(TUser user) {
        return userMapper.update(user);
    }

    @Override
    public List<Map<String, Object>> getListMyName(String name) {
        return userMapper.getListMyName(name);
    }
}
