package com.example.springRest;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses {
	
	@Id
	private Integer id;
	private String title;
	private String describe;
	
	public Courses(Integer id, String title, String describe) {
		//super();
		this.id = id;
		this.title = title;
		this.describe = describe;
	}

	public Courses() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	

}


