package com.model;
import java.util.List;

public class Book {

	private int bid;
	private String bname;
	private int price;
	private List books;
	
	public List getBooks() {
		return books;
	}
	public void setBooks(List books) {
		this.books = books;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	
}
