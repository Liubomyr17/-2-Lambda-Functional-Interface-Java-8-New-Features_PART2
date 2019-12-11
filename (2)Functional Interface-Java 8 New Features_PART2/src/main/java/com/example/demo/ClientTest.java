package com.example.demo;

public class ClientTest {

    public static void main(String[] args) {

        //  createThreadUsingAnonymousClass();
        createThreadUsingLambdaExpression();
    }

    private static void createThreadUsingLambdaExpression() {
        Runnable r = () -> {
            System.out.println("My task is executing...");
        };
        Thread thread = new Thread(r);
        thread.start();
    }

    private static void createThreadUsingAnonymousClass() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("My task is executing...");
            }
        };

        Thread thread = new Thread(r);
        thread.start();
    }
}


