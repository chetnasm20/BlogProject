package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int blogId;
private String title;
private String description;
private String author;
public int getBlogId() {
	return blogId;
}
public void setBlogId(int blogId) {
	this.blogId = blogId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author=author;
}
public Blog(int blogId, String title, String description,String author) {
	super();
	this.blogId = blogId;
	this.title = title;
	this.description = description;
	this.author=author;
}
public Blog() {
	super();
	// TODO Auto-generated constructor stub
}

}
