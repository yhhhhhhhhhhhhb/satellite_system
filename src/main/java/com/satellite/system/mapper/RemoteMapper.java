package com.satellite.system.mapper;

import com.satellite.system.bean.TRemote;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 21:55 2019/3/22
 * @Modified By:
 */
@Mapper
public interface RemoteMapper {

    @Select("select * from remote where task_number in (${ids})")
    List<TRemote>  queryTelecontrolContent(@Param("ids") String ids);

}
