package com.satellite.system.mapper;

import com.satellite.system.bean.TUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 15:52 2018/7/21
 * @Modified By:
 */
@Mapper
public interface UserMapper {

    /**
     * 查看用户是否登陆
     * @param username
     * @return
     */
    @Select("select count(id) from user where username = #{username} and password = #{password}")
    int countUser(@Param("username") String username,@Param("password")String password);

    @Select("select * from user")
    List<TUser> getAllUser();

    @Update("update user set username = #{user.username},password = #{user.password},role=#{user.role},create_time=#{user.create_time} where id =#{user.id}")
    int updateUser(TUser user);

    @Delete("delete from user where username = #{userName}")
    int deleteUser(String userName);

    @Insert("inert into user(username,password,role,create_time) values (#{user.username},#{user.password},#{user.role},#{user.create_time})")
    int addUser(TUser user);

}
