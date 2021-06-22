package io.github.entity;

import io.github.entity.base.BasePersonEntity;
import io.github.entity.enums.FamilyRoleEnum;
import lombok.Data;

/**
 * 家人实体
 */
@Data
public class StudentFamily extends BasePersonEntity {

    /**
     * 学员ID
     */
    private Long studentId;

    private FamilyRoleEnum familyRole;

}
