package com.satellite.system.mapper;

import org.apache.ibatis.jdbc.SQL;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 13:16 2019/3/23
 * @Modified By:
 */
public class SatelliteSqlProvider {


    public String getSql(){
        return new SQL(){
            {
                SELECT("*");
                FROM("satellite_info");
                WHERE("task_number in (#{taskIds})");
            }
        }.toString();
    }
}
