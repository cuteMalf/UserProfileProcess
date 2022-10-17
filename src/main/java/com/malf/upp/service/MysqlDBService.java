package com.malf.upp.service;

import com.malf.upp.bean.TagInfo;
import com.malf.upp.bean.TaskInfo;
import com.malf.upp.bean.TaskTagRule;
import com.malf.upp.mapper.TagInfoMapper;
import com.malf.upp.mapper.TaskInfoMapper;
import com.malf.upp.mapper.TaskTagRuleMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MysqlDBService {
    private TagInfoMapper tagInfoMapper;
    private TaskInfoMapper taskInfoMapper;
    private TaskTagRuleMapper taskTagRuleMapper;

    public MysqlDBService(SqlSession session){
        this.tagInfoMapper=session.getMapper(TagInfoMapper.class);
        this.taskInfoMapper=session.getMapper(TaskInfoMapper.class);
        this.taskTagRuleMapper=session.getMapper(TaskTagRuleMapper.class);
    }


    public TagInfo getTagInfoById(Integer id){
        TagInfo tagInfoById = tagInfoMapper.getTagInfoById(id);
        return tagInfoById;

    }

    // 查询所有要执行的任务
    public List<TaskInfo> getAllTaskInfos(){
        List<TaskInfo> allTaskInfos = taskInfoMapper.getAllTaskInfos();
        return allTaskInfos;

    }

    //根据id查询某个任务
    public TaskInfo getTaskInfoById(Integer id){
        TaskInfo taskInfoById = taskInfoMapper.getTaskInfoById(id);
        return taskInfoById;
    }

    //根据taskId 查询，当前任务属于那个query_value

    public List<TaskTagRule> getTaskTagRuleByTaskId(Integer taskId){
        List<TaskTagRule> taskTagRuleByTaskId = taskTagRuleMapper.getTaskTagRuleByTaskId(taskId);
        return taskTagRuleByTaskId;
    }

}
