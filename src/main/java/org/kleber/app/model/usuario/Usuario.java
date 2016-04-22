package org.kleber.app.model.usuario;

import org.kleber.app.generic.Model;

public class Usuario extends Model {
  private Integer id;

  private String username;

  private String password;

  private String firstName;

  private String lastName;

  private String email;

  @Override
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String value) {
    this.username = value;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String value) {
    this.password = value;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String value) {
    this.firstName = value;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String value) {
    this.lastName = value;
  }

  public String getEmail() {
    return firstName;
  }

  public void setEmail(String value) {
    this.email = value;
  }

  @Override
  public String toString() {
    return firstName+" "+lastName;
  }
}
