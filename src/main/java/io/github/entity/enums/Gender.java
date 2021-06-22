package io.github.entity.enums;

/**
 * 性别
 */
public enum Gender {
  /**
   * male的缩写 表示男
   */
  M {
    @Override
    public String getValueKey() {
      // TODO Auto-generated method stub
      return "gender.m";
    }
  },
  /**
   * female的缩写 表示女
   */
  F {
    @Override
    public String getValueKey() {
      // TODO Auto-generated method stub
      return "gender.f";
    }
  };

  public abstract String getValueKey();
}
