package com.satellite.system.mapper;

import com.satellite.system.bean.TLog;
import com.satellite.system.bean.TUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 0:54 2019/3/22
 * @Modified By:
 */
@Mapper
public interface LogMapper {


    @Select("select * from log where `datetime` > #{time1} and `datetime`<#{time2}")
    List<TLog> getLogsByTime(@Param("time1") String time1, @Param("time2") String time2);

    @Update("update user set username = #{user.username},password = #{user.password},role=#{user.role},create_time=#{user.create_time} where id =#{user.id}")
    int updateLog(TLog user);

    @Delete("delete from log where `datetime` > #{time1} and `datetime`<#{time2}")
    int deleteLog(@Param("time1") String time1, @Param("time2") String time2);

    @Insert("insert into log(datetime,object,type,data) values (#{datetime},#{object},#{type},#{data})")
    int addLog(TLog log);
}
