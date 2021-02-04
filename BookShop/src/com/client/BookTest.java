/**
 * 
 */
package com.client;

import java.util.Scanner;

import com.impl.BookServiceImpl;

/**
 * @author Rutuja
 *
 */
public class BookTest {

	public static void main(String[] args) {
		BookServiceImpl bs = new BookServiceImpl();
		Scanner sc = new Scanner(System.in);
		String s = "";
		System.out.println("...  WELCOME to BookShop.com  ...");
		do {
			System.out.println();
			System.out.println("1] add Book");
			System.out.println("2] view Book");
			System.out.println("3] add Author");
			System.out.println("4] view Author & Book");
			System.out.println("5] addToCart");
			System.out.println("6] Bill");
			System.out.println("7] Exit");
			System.out.println();
			System.out.println("Coose any option");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				bs.addBook();
				break;
			case 2:
				bs.displayBook();
				break;
			case 3:
				bs.addAuthor();
				break;
			case 4:
				bs.displayAuthor();
				break;
			case 5:
				bs.addToCart();
				break;
			case 6:
				bs.createBill();
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid selection...!");
				break;
			}
			System.out.println("Do you want to continue...?  y/n");
			s = sc.next();
		} while (s.equals("y"));
	}
}
