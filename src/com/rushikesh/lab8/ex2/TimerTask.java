package com.rushikesh.lab8.ex2;



public class TimerTask implements Runnable {

    @Override
    public void run() {

        int seconds = 0;

        try {

            while (true) {

                System.out.println(
                        "Timer Running: " + seconds + " seconds");

                Thread.sleep(10000); // 10 seconds

                seconds += 10;
            }

        } catch (InterruptedException e) {

            System.out.println("Timer Interrupted");
        }
    }
}
