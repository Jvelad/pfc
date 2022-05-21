package com.example.accessingdatamysql.Out_Text;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Out_Text {

	@Id
	private int id;
	
	private int lang_id;

	private String intl_id;
	
	private String text;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLang_id() {
		return lang_id;
	}

	public void setLang_id(int lang_id) {
		this.lang_id = lang_id;
	}

	public String getIntl_id() {
		return intl_id;
	}

	public void setIntl_id(String intl_id) {
		this.intl_id = intl_id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}