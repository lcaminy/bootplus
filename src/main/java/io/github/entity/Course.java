package io.github.entity;

import io.github.entity.base.AbstractLongEntity;
import io.github.entity.enums.CourseLearnType;
import lombok.Data;

/**
 * 课程表
 */
@Data
public class Course extends AbstractLongEntity {

    /**
     * 课程编号
     */
    private String number;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 课程科目类别
     */
    private CourseSubject courseSubject;

    /**
     * 上课方式
     */
    private CourseLearnType learnType;


    /**
     * 是否线上
     */
    private Boolean online;


}
