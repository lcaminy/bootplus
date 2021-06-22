package io.github.entity.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author huangsu2012@gmail.com
 * @ClassName: AbstractLongEntity
 * @Description: 主键为Long类型的实体
 * @date 2015年3月20日 下午2:40:33
 */
@MappedSuperclass
public abstract class AbstractLongEntity extends AbstractEntity<Long> {

  private static final long serialVersionUID = -7756236701005748806L;

  public AbstractLongEntity() {
    super();
  }

  public AbstractLongEntity(Long id) {
    super(id);
  }

  @Override
  public Long getId() {
    return id;
  }

}
