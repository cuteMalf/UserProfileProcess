package com.malf.upp.mapper;

import com.malf.upp.bean.TaskInfo;
import com.malf.upp.bean.TaskTagRule;

import java.util.List;

public interface TaskTagRuleMapper {
//    void InsertTaskTagRule(TaskInfo tagInfo);
//    void DeleteTaskTagRuleById(Integer id);
//    Void UpdateTaskTagRule(TaskInfo tagInfo);

    List<TaskTagRule> getTaskTagRuleByTaskId(Integer id);

//    List<TaskTagRule> getAllTaskTagRules();
}
