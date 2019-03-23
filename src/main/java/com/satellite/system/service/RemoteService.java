package com.satellite.system.service;

import com.satellite.system.bean.TRemote;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 22:19 2019/3/22
 * @Modified By:
 */
public interface RemoteService {


    List<TRemote> queryTelecontrolContent(String ids);
}
