package com.valtech.spring.boot.assignment.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("hb")
public class HandBook extends Book {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;

	private int isbn;
	private double price;
//	@Temporal(TemporalType.DATE)
	private String published_year;
	private int editions;
	
	public HandBook(String name, String whenPublished, int id, int isbn, double price, String published_year,
			int editions) {
		super(name, whenPublished);
		this.id = id;
		this.isbn = isbn;
		this.price = price;
		this.published_year = published_year;
		this.editions = editions;
	}

	public HandBook() {
		super();
	}

	public HandBook(int isbn, double price, String published_year, int editions) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.published_year = published_year;
		this.editions = editions;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublished_year() {
		return published_year;
	}

	public void setPublished_year(String published_year) {
		this.published_year = published_year;
	}

	public int getEditions() {
		return editions;
	}

	public void setEditions(int editions) {
		this.editions = editions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
