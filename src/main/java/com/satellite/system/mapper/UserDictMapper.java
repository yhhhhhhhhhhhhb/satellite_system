package com.satellite.system.mapper;

import com.satellite.system.bean.TUser;
import com.satellite.system.bean.TUserDict;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 12:41 2019/3/30
 * @Modified By:
 */
public interface UserDictMapper {

    @Select("select * from user_dict where token = #{token}")
    List<TUserDict> getUsersByToken(String token);

    @Insert("insert into user_dict(username,token,date) values (#{username},#{token},#{date})")
    Integer addToken(TUserDict tUserDict);


    @Delete("delete from user_dict where username = #{userName}")
    Integer deleteUserDict(String userName);

    @Delete("delete from user_dict where date < #{time}")
    Integer deleteBytime(String time);
}
