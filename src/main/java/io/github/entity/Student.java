package io.github.entity;

import io.github.entity.base.BasePersonEntity;
import io.github.entity.enums.StudentOriginEnum;
import io.github.entity.enums.StudentStatusEnum;
import io.github.entity.enums.SaleTrackStatusEnum;
import lombok.Data;

/**
 * 学员表
 */
@Data
public class Student extends BasePersonEntity {

    /**
     * 学员来源
     */
    private StudentOriginEnum studentOriginEnum;

    /**
     * 学员状态
     */
    private StudentStatusEnum studentStatus;

    /**
     * 跟进状态
     */
    private SaleTrackStatusEnum trackStatus;


}
