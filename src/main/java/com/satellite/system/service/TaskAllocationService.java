package com.satellite.system.service;

import com.satellite.system.bean.TTaskAllocation;

import java.util.List;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 22:16 2019/3/21
 * @Modified By:
 */
public interface TaskAllocationService {

    Integer addTaskAssignment(TTaskAllocation tTaskAllocation);

    Integer cancelTask(Integer taskId);

    List<TTaskAllocation> queryTaskAssignment(TTaskAllocation tTaskAllocation);
}
