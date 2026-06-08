package com.rushikesh.lab4.ex3;


public class LibraryDemo {

    public static void main(String[] args) {

        Book book = new Book(
                101,
                "Java Programming",
                5,
                "James Gosling");

        JournalPaper journal = new JournalPaper(
                201,
                "AI Research",
                3,
                "Andrew Ng",
                2023);

        Video video = new Video(
                301,
                "Inception",
                2,
                148,
                "Christopher Nolan",
                "Sci-Fi",
                2010);

        CD cd = new CD(
                401,
                "Greatest Hits",
                4,
                60,
                "Michael Jackson",
                "Pop");

        // Print details
        book.print();
        journal.print();
        video.print();
        cd.print();

        System.out.println("\n--- Transactions ---");

        book.checkOut();
        book.checkIn();

        video.addItem(3);

        System.out.println("\n--- Updated Details ---");

        book.print();
        video.print();
    }
}
