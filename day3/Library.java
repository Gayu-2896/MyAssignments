package week1.day3;

import java.lang.reflect.Method;

public class Library {
	
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully:"  + bookTitle);
		return (bookTitle);}
		
		 void issueBook() {
			System.out.println("Book issued successfully");

	}
		public static void main(String[] args) {
			
			Library bg =new Library();
			
			bg.addBook("One Indian Girl");
			bg.issueBook();
			
		}}

		
		
