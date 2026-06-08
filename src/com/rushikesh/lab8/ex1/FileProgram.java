package com.rushikesh.lab8.ex1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProgram {

    public static void main(String[] args) {

        try {

            // Source File
            FileInputStream fis =
                    new FileInputStream("source.txt");

            // Target File
            FileOutputStream fos =
                    new FileOutputStream("target.txt");

            // Create Thread Object
            CopyDataThread thread =
                    new CopyDataThread(fis, fos);

            // Start Thread
            thread.start();

        } catch (IOException e) {

            System.out.println(
                    "File Error: " + e.getMessage());
        }
    }
}