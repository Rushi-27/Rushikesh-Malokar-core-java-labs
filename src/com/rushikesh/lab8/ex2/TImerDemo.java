package com.rushikesh.lab8.ex2;


public class TImerDemo {

    public static void main(String[] args) {

        TimerTask task = new TimerTask();

        Thread timerThread = new Thread(task);

        timerThread.start();
    }
}
