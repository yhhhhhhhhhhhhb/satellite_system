package com.satellite.system.mapper;


import com.satellite.system.bean.TUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 15:52 2018/7/21
 * @Modified By:
 */
@Mapper
public interface UserMapper {

    @Insert("insert into t_user(name,adress) values (#{user.name}),#{user.adress}")
    int insert(TUser user);

    @Update("update t_user set name = #{user.name},adress = #{user.adress} where id = #{user.id}")
    int update(TUser user);

    @Select("SELECT * FROM t_user WHERE id = #{id}")
    TUser getUserById(Integer id);

    @Select("SELECT * FROM t_user")
    public List<TUser> getUserList();

    @Select("select * from t_user a left join t_overtime_info b on a.name = b.name where a.name = #{name}")
    public List<Map<String,Object>> getListMyName(String name);


}
