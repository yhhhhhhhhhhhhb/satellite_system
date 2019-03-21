package com.satellite.system.mapper;

import com.satellite.system.bean.TTaskAllocation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 22:02 2019/3/21
 * @Modified By:
 */
@Mapper
public interface TaskAllocationMapper {

    @Insert("insert into task_allocation(station_number,satellite_number,task_type,planned_start_date,planned_start_date) values (#{tTaskAllocation.stationNumber},#{tTaskAllocation.satelliteNumber},#{tTaskAllocation.taskType},#{tTaskAllocation.plannedStartDate},#{tTaskAllocation.planDeadline})")
    int addTask(TTaskAllocation tTaskAllocation);

    @Delete("delete from task_allocation where id = #{taskId}")
    int delectTask(Integer taskId);

}
