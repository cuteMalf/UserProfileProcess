package com.malf.upp.mapper;

import com.malf.upp.bean.TaskInfo;

import java.util.List;

public interface TaskInfoMapper {
//    void InsertTaskInfo(TaskInfo tagInfo);
//    void DeleteTaskInfoById(Integer id);
//    Void UpdateTaskInfo(TaskInfo tagInfo);

    TaskInfo getTaskInfoById(Integer id);
    List<TaskInfo> getAllTaskInfos();
}
