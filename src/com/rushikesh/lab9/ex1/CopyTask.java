package com.rushikesh.lab9.ex1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTask implements Runnable {

    private String source;
    private String target;

    public CopyTask(String source, String target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public void run() {

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target)) {

            int ch;
            int count = 0;

            while ((ch = fis.read()) != -1) {

                fos.write(ch);
                count++;

                if (count % 10 == 0) {

                    System.out.println(
                            Thread.currentThread().getName()
                            + " -> 10 characters copied");

                    Thread.sleep(5000);
                }
            }

            System.out.println("File Copy Completed.");

        } catch (IOException | InterruptedException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
