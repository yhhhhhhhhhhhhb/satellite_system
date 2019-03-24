package com.satellite.system.service.impl;

import com.satellite.system.bean.TRemote;
import com.satellite.system.mapper.RemoteMapper;
import com.satellite.system.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 22:20 2019/3/22
 * @Modified By:
 */
@Service
public class RemoteServiceImpl implements RemoteService{

    @Autowired
    RemoteMapper remoteMapper;

    @Override
    public List<TRemote> queryTelecontrolContent(String ids) {
        List<TRemote> list = remoteMapper.queryTelecontrolContent(ids);
        return list;
    }
}
