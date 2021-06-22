package io.github.entity;

import io.github.entity.base.AbstractLongEntity;
import lombok.Data;

/**
 * 机构
 */
@Data
public class Organization extends AbstractLongEntity {

    private String name;


}
