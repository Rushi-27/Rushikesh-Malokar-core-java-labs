package com.rushikesh.lab8.ex1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {

    private FileInputStream fis;
    private FileOutputStream fos;

    public CopyDataThread(FileInputStream fis,
                          FileOutputStream fos) {

        this.fis = fis;
        this.fos = fos;
    }

    @Override
    public void run() {

        int ch;
        int count = 0;

        try {

            while ((ch = fis.read()) != -1) {

                fos.write(ch);

                count++;

                // After every 10 characters
                if (count % 10 == 0) {

                    System.out.println(
                            "10 characters are copied");

                    // Delay of 5 seconds
                    Thread.sleep(5000);
                }
            }

            System.out.println(
                    "File Copy Completed Successfully.");

        } catch (IOException e) {

            System.out.println(
                    "IO Exception: " + e.getMessage());

        } catch (InterruptedException e) {

            System.out.println(
                    "Thread Interrupted.");

        } finally {

            try {

                fis.close();
                fos.close();

            } catch (IOException e) {

                System.out.println(
                        "Error while closing files.");
            }
        }
    }
}