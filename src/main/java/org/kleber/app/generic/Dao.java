package org.kleber.app.generic;

import java.util.List;
import java.util.ArrayList;

public abstract class Dao<E extends Model> {
  protected Class<E> clazz;

  public Dao(Class<E> clazz) {
    this.clazz = clazz;
  }

  public Class<E> getClazz() {
    return this.clazz;
  }

  public void setClazz(Class<E> clazz) {
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

  public List<E> select() {
    return new ArrayList<E>();
  }
}
