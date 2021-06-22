package io.github.entity.base;

import io.github.entity.enums.Education;
import io.github.entity.enums.Gender;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class BasePersonEntity extends AbstractLongEntity{

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机,登录账号
     */
    private String mobile;

    /**
     * 性别
     */
    private Gender gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 用户学历
     */
    private Education education;
}
