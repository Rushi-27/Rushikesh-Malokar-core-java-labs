package com.rushikesh.lab4.ex3;

public class CD extends MediaItem {

    private String artist;
    private String genre;

    public CD(int idNumber, String title,
              int numberOfCopies, int runtime,
              String artist, String genre) {

        super(idNumber, title, numberOfCopies, runtime);

        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {

        return "CD -> " + super.toString() +
                ", artist=" + artist +
                ", genre=" + genre;
    }
}