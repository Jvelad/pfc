package com.example.accessingdatamysql.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Users {
  @Id

  private Integer id;
  
  private String admin;
  
  private String name;
  
  private String password;
  
  private String lang_id;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getAdmin() {
	return admin;
}

public void setAdmin(String admin) {
	this.admin = admin;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getLang_id() {
	return lang_id;
}

public void setLang_id(String lang_id) {
	this.lang_id = lang_id;
}
  
}