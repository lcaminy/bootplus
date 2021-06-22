package io.github.entity;

import io.github.entity.base.BasePersonEntity;
import lombok.Data;

/**
 * 员工表
 */
@Data
public class Employee extends BasePersonEntity {

    /**
     * 所属机构
     */
    private Long organizationId;
}
