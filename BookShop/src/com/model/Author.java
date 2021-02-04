package com.model;
import java.util.List;

public class Author {
	private int aid;
	private String aname;
	private List books;
	private List authors;
	
	public List getAuthors() {
		return authors;
	}
	public void setAuthors(List authors) {
		this.authors = authors;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public List getBooks() {
		return books;
	}
	public void setBooks(List books) {
		this.books = books;
	}
	
	

}
