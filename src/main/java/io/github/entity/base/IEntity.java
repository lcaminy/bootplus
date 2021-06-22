package io.github.entity.base;

import java.io.Serializable;

/**
 * Created by huangsu2012@gmail.com on 2018/2/26.
 */
public interface IEntity<ID extends Serializable> extends Serializable {

  ID getId();

  void setId(ID id);
}
