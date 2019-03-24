package com.satellite.system.service.impl;

import com.satellite.system.bean.TTaskAllocation;
import com.satellite.system.mapper.TaskAllocationMapper;
import com.satellite.system.service.TaskAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 22:16 2019/3/21
 * @Modified By:
 */
@Service
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

    @Override
    public List<TTaskAllocation> queryTaskAssignment(TTaskAllocation tTaskAllocation) {
        List<TTaskAllocation> list = taskAllocationMapper.queryTask(tTaskAllocation);
        return list;
    }
}
