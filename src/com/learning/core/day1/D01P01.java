package com.learning.com.day1;

public class D01P01 extends Book
{
	    public static void main(String[] args) {
	        createBooks("Java Programming", 350.0);
	        
	        Book book1 = new Book();
	        book1.setbook_title("JavaScript Programming");
	        book1.setbook_price(350.0);

	        showBooks(book1);
	    }
}
