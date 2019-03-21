package com.satellite.system.service.impl;

import com.satellite.system.bean.TTaskAllocation;
import com.satellite.system.mapper.TaskAllocationMapper;
import com.satellite.system.service.TaskAllocationService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 22:16 2019/3/21
 * @Modified By:
 */
public class TaskAllocationServiceImpl implements TaskAllocationService{

    @Autowired
    TaskAllocationMapper taskAllocationMapper;

    @Override
    public Integer addTaskAssignment(TTaskAllocation tTaskAllocation) {
        Integer affect = taskAllocationMapper.addTask(tTaskAllocation);
        return affect;
    }

    @Override
    public Integer cancelTask(Integer taskId) {
        Integer affect = taskAllocationMapper.delectTask(taskId);
        return affect;
    }
}
