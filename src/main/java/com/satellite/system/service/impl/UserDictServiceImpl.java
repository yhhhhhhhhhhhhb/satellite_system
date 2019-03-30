package com.satellite.system.service.impl;

import com.satellite.system.bean.TUserDict;
import com.satellite.system.mapper.UserDictMapper;
import com.satellite.system.service.UserDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;


/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 12:49 2019/3/30
 * @Modified By:
 */
@Service
public class UserDictServiceImpl implements UserDictService{

    @Autowired
    UserDictMapper userDictMapper;

    @Override
    public boolean isExitToken(String token) {
        List<TUserDict> list = userDictMapper.getUsersByToken(token);
        if(CollectionUtils.isEmpty(list)){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Integer addToken(TUserDict tUserDict) {
        Integer i = userDictMapper.addToken(tUserDict);
        return i;
    }

    @Override
    public Integer deleteUserDict(String userName) {
        Integer i = userDictMapper.deleteUserDict(userName);
        return i;
    }

    @Override
    public Integer deleteBytime(String time) {
        Integer affect = userDictMapper.deleteBytime(time);
        return affect;
    }

    @Override
    public TUserDict getToken(String token) {
        List<TUserDict> userDicts = userDictMapper.getUsersByToken(token);
        TUserDict userDict = userDicts.stream().findFirst().orElse(null);
        return userDict;
    }
}
