package com.malf.upp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskInfo {
    Long id;
    String taskName;
    String taskStatus;
    String taskComment;
    String taskType;
    String execType;
    String mainClass;
    Long fileId;
    String taskArgs;
    String taskSql;
    Long taskExecLevel;
    Timestamp createTime;
}
