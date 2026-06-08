package com.rushikesh.lab4.ex3;

public class Book extends WrittenItem {

//    public Book(int idNumber, String title,
//                int numberOfCopies, String author) {
//
//        
//    }

    public Book(int idNumber, String title, int numberOfCopies, String author) {
		// TODO Auto-generated constructor 
    	super(idNumber, title, numberOfCopies, author);
	}

	@Override
    public String toString() {
        return "Book -> " + super.toString();
    }
}
