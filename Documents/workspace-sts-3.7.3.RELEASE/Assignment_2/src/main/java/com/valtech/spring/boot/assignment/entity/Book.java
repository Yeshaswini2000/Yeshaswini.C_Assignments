package com.valtech.spring.boot.assignment.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.valtech.spring.boot.assignment.entity.Publisher;


@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
//	@Temporal(TemporalType.DATE)
	private String whenPublished;

	@ManyToMany(targetEntity = Author.class, cascade = { CascadeType.MERGE,
			CascadeType.PERSIST }, fetch = FetchType.EAGER)
	@JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"))
	private Set<Author> author;

	@ManyToOne(targetEntity = Publisher.class, cascade = { CascadeType.MERGE,
			CascadeType.PERSIST }, fetch = FetchType.EAGER)
	@JoinColumn(name = "publisher_id", referencedColumnName = "id")

	private Publisher publisher;
	// @JoinColumn(name="account_id",referencedColumnName="id")

	public Publisher getPublisher() {
		return publisher;
	}

	public Set<Author> getAuthor() {
		return author;
	}

	public void setAuthor(Set<Author> author) {
		this.author = author;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Book(String name, String whenPublished) {
		super();
		this.name = name;
		this.whenPublished = whenPublished;
	}

	public Book() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWhenPublished() {
		return whenPublished;
	}

	public void setWhenPublished(String whenPublished) {
		this.whenPublished = whenPublished;
	}

}
