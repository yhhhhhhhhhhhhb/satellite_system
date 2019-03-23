package com.satellite.system.mapper;

import com.satellite.system.bean.TRemote;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 21:55 2019/3/22
 * @Modified By:
 */
public interface RemoteMapper {

    @SelectProvider(type = RemoteSqlProvider.class,method = "getSql")
    List<TRemote>  queryTelecontrolContent(String ids);

}
