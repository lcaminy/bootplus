package io.github.entity;

import io.github.entity.base.AbstractLongEntity;
import lombok.Data;

/**
 * 学生所属机构 一个学员可以是多个机构下的学员
 */
@Data
public class StudentOrganizationRe extends AbstractLongEntity {

    /**
     * 学员ID
     */
    private Long studentId;

    /**
     * 机构ID
     */
    private Long organizationId;
}
