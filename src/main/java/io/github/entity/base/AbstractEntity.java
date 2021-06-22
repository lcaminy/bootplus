package io.github.entity.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements IEntity<ID> {

  /**
   * @Fields serialVersionUID : TODO
   */
  private static final long serialVersionUID = -2141132613884283898L;
  @TableId(type = IdType.AUTO)
  protected ID id;


  public AbstractEntity() {
    super();
  }

  public AbstractEntity(ID id) {
    super();
    this.id = id;
  }

  @Override
  public ID getId() {
    return id;
  }

  @Override
  public void setId(ID id) {
    this.id = id;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    AbstractEntity<?> other = (AbstractEntity<?>) obj;
    if (id == null) {
      if (other.id != null) {
        return false;
      }
    } else if (!id.equals(other.id)) {
      return false;
    }
    return true;
  }

}
