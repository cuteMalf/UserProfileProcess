package com.malf.upp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TagInfo {
    Long id;
    String tagCode;
    String tagName;
    Long tagLevel;
    Long parentTagId;
    String tagType;
    String tagValueType;
    Long tagTaskId;
    String tagComment;
    Timestamp createTime;
    Timestamp updateTime;
}
