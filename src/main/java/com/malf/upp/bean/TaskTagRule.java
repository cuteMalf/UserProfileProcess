package com.malf.upp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskTagRule {
    Long id;
    Long tagId;
    Long taskId;
    String queryValue;
    Long subTagId;
    String subTagValue;
}
