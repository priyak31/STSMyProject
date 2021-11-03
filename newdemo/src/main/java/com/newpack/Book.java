package com.newpack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String author;
    private BigDecimal price;
	
	public Book(String string, String string2, BigDecimal bigDecimal) {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public Book() {
		super();
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

    //setters, getters, constructors...
}