package com.valtech.spring.boot.assignment.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("bg")
public class Blog {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String url;
	private int visited_num;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Blog(int id, String url, int visited_num) {
		super();
		this.id = id;
		this.url = url;
		this.visited_num = visited_num;
	}

	public Blog(String url, int visited_num) {
		super();
		this.url = url;
		this.visited_num = visited_num;
	}

	public Blog() {
		super();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getVisited_num() {
		return visited_num;
	}

	public void setVisited_num(int visited_num) {
		this.visited_num = visited_num;
	}

}
