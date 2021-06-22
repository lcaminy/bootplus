package io.github.entity;

import io.github.entity.base.AbstractLongEntity;
import io.github.entity.enums.SaleTrackStatusEnum;
import lombok.Data;

/**
 * 学员销售跟着表
 */
@Data
public class StudentSaleTrack extends AbstractLongEntity {

    /**
     * 跟踪学员ID
     */
    private Long studentId;

    /**
     * 负责员工ID
     */
    private Long employeeId;

    /**
     * 销售跟踪状态
     */
    private SaleTrackStatusEnum saleTrackStatus;
}
