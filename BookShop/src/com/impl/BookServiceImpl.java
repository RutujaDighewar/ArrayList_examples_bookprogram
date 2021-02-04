/**
 * 
 */
package com.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.model.Author;
import com.model.Book;
import com.service.BookService;

/**
 * @author Rutuja
 *
 */
public class BookServiceImpl implements BookService {
	Scanner sc = new Scanner(System.in);
	List books = null;
	List authors = null;
	List AB = null;
	List cart = null;

	@Override
	public void addBook() {
		books = new ArrayList();
		System.out.println("How many books you want to add ?");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			Book b = new Book();
			System.out.println("Enter book id");
			b.setBid(sc.nextInt());
			System.out.println("Enter book name");
			b.setBname(sc.next());
			System.out.println("Enter Book price");
			b.setPrice(sc.nextInt());
			books.add(b);
		}

	}

	@Override
	public void addAuthor() {
		authors = new ArrayList();

		System.out.println("How many authors want to view");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			Author a = new Author();
			System.out.println("Enter author id");
			a.setAid(sc.nextInt());
			System.out.println("Enter author name");
			a.setAname(sc.next());
			//authors.add(a);
			displayBook();
			AB = new ArrayList();
			System.out.println();
			System.out.println("How many books want to allocate");
			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				System.out.println("Enter book id to allcate to author");
				int id = sc.nextInt();
				for (Object o : books) {
					Book b = (Book) o;
					if (b.getBid() == id) {
						AB.add(b);
					}
				}
				a.setBooks(AB);
			}
			authors.add(a);
		}
	}

	@Override
	public void displayBook() {

		System.out.println("-----------------------------------------");
		System.out.println("                BOOK               ");
		System.out.println("-----------------------------------------");
		System.out.println("Book id      Book name      Book price");
		if (!books.isEmpty()) {
			for (Object o : books) {
				Book b = (Book) o;
				System.out.println(b.getBid() + "\t\t" + b.getBname() + "\t\t" + b.getPrice());
			}
			System.out.println("---------------------------------------");
			System.out.println();
		}

	}

	@Override
	public void displayAuthor() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("          AUTHOR                            BOOK                ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Author id      Author name      Book id     Book name      Book price");
		if (!authors.isEmpty()) {
			for (Object ob : authors) {
				Author a = (Author) ob;
				if (!a.getBooks().isEmpty()) {
					for (Object o : a.getBooks()) {
						Book bb = (Book) o;
						System.out.println(a.getAid() + "\t\t" + a.getAname() + "\t\t" + bb.getBid() + "\t\t"
								+ bb.getBname() + "\t\t" + bb.getPrice());
					}
				}
			}
			System.out.println("------------------------------------------------------------------");
			System.out.println();
		}
	}

	@Override
	public void addToCart() {
		cart = new ArrayList();
		System.out.println("How many book want to buy ?");
		int num = sc.nextInt();
		displayAuthor();
		for (int i = 0; i < num; i++) {

			System.out.println("Enter book id which want to buy");
			int id = sc.nextInt();
			for (Object o : books) {
				Book b = (Book) o;
				if (b.getBid() == id) {
					cart.add(b);
				}
				b.setBooks(cart);
			}
		}

	}

	@Override
	public void createBill() {

		int finalGrandTotal = 0;
		System.out.println("------------------------------------");
		System.out.println("Book id     Book name     Book price");
		System.out.println("------------------------------------");

		if (!cart.isEmpty()) {
			for (Object ob : cart) {
				Book b = (Book) ob;
				System.out.println(b.getBid() + "\t\t" + b.getBname() + "\t\t" + b.getPrice());
				finalGrandTotal += b.getPrice();
			}
			System.out.println("------------------------------------");
			System.out.println("Your total is = " + finalGrandTotal);
			System.out.println("-------------------------------------");
			System.out.println();

		}
	}

}
