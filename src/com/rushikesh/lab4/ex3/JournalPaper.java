package com.rushikesh.lab4.ex3;

public class JournalPaper extends WrittenItem {

    private int yearPublished;

    public JournalPaper(int idNumber, String title,
                        int numberOfCopies,
                        String author, int yearPublished) {

        super(idNumber, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "JournalPaper -> " + super.toString() +
                ", yearPublished=" + yearPublished;
    }
}
