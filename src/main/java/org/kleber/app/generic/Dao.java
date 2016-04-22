package org.kleber.app.generic;

public abstract class Dao {
  protected Class<?> clazz;

  public Dao(Class<?> clazz) {
    this.clazz = clazz;
  }

  public Class<?> getClazz() {
    return this.clazz;
  }

  public void setClazz(Class<?> clazz) {
    this.clazz = clazz;
  }

  public void insert(Model object) {
    //
  }

  public void update(Model object) {
    //
  }

  public void delete(Model object) {
    //
  }

  public void select() {
    //
  }
}
