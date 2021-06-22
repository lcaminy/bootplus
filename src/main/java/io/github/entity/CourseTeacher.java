package io.github.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 授课老师,同时也是机构员工
 */
@Data
public class CourseTeacher implements Serializable {


    /**
     * 是否禁用
     */
    private Boolean disable;

    /**
     * 老师编号
     */
    private String number;
}
