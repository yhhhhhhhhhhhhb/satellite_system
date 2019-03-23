package com.satellite.system.mapper;

import org.apache.ibatis.jdbc.SQL;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 22:08 2019/3/22
 * @Modified By:
 */
public class RemoteSqlProvider {

    public String getSql(){
        return new SQL(){
            {
                SELECT("*");
                FROM("remote");
                WHERE("task_number in (#{taskIds})");
            }
        }.toString();
    }
}
