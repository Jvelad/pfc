package com.example.accessingdatamysql.language;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Language {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String intl_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntl_id() {
		return intl_id;
	}

	public void setIntl_id(String intl_id) {
		this.intl_id = intl_id;
	}

}