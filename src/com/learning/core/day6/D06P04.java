package com.learning.core.day6;

import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

class Book1 implements Comparable<Book1>
{
	private int bookId;
	private String title;
	private double price;
	private Date dOfPubl;
	private String author;
	
	public Book1() {
		super();
	}

	public Book1(int bookId, String title, double price, Date dOfPubl, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.dOfPubl = dOfPubl;
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getdOfPubl() {
		return dOfPubl;
	}

	public void setdOfPubl(Date dOfPubl) {
		this.dOfPubl = dOfPubl;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, dOfPubl, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book1 other = (Book1) obj;
		return Objects.equals(author, other.author) && bookId == other.bookId && Objects.equals(dOfPubl, other.dOfPubl)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return bookId + " " + title + " " + price + " "+ author+" " 
				+ dOfPubl.getDate()+"/"+dOfPubl.getMonth()+"/"+dOfPubl.getYear();
	}

	public int compareTo(Book1 o) 
	{
		return this.author.compareTo(o.author);
	}
	
	
}
@SuppressWarnings("deprecation")
public class D06P04 
{
	public static void main(String[] args) 
	{
		TreeSet<Book1> b= new TreeSet<>();
		
		b.add(new Book1(1001,"Python Learning",715,new Date(2020,2,2),"Martic C. Brown"));
		b.add(new Book1(1002,"Modern Mainframe",295,new Date(1997,5,19),"Sharad"));
		b.add(new Book1(1003,"java Programming",523,new Date(1984,11,23),"Gilad Bracha"));
		b.add(new Book1(1004,"Read C++",295,new Date(1984,11,19),"Henry Harvin"));
		b.add(new Book1(1005,".Net Platform",3497,new Date(1984,3,6),"Mark J. Price"));
		
		//System.out.println(b);
		for (Book1 bk : b) 
		{
            System.out.println(bk);
        }
	}

}
