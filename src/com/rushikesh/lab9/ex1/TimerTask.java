package com.rushikesh.lab9.ex1;

public class TimerTask implements Runnable {

    @Override
    public void run() {

        int seconds = 0;

        try {

            while (true) {

                System.out.println(
                        "Timer: " + seconds + " sec");

                Thread.sleep(10000);

                seconds += 10;
            }

        } catch (InterruptedException e) {

            System.out.println("Timer stopped");
        }
    }
}
