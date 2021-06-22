package io.github.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 课程助手
 */
@Data
public class CourseAssistant implements Serializable {

    /**
     * 员工账号ID
     */
    private Long employeeId;
}
