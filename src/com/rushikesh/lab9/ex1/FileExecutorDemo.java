package com.rushikesh.lab9.ex1;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileExecutorDemo {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newSingleThreadExecutor();

        executor.execute(
                new CopyTask("source.txt", "target.txt"));

        executor.shutdown();
    }
}