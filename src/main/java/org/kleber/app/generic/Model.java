package org.kleber.app.generic;

public abstract class Model extends Object {
  public abstract Integer getId();

  public boolean equals(Model object) {
    return getId().equals(object.getId());
  }

  public abstract String toString();
}
