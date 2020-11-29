package com.java8.introductiontolambda;

public class RunnableWIthLambda {
    public static void main(String[] args) {

        //runnableWithoutLambda();
        //runnableWIthLambda();
        runnableWithLambdaShortestWay();
    }
    public static void runnableWithoutLambda(){

        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println("Newly created Thread. Runnable without lambda");
            }
        };
        new Thread(r).start();
        System.out.println("Original Thread without lambda");
    }

    public static void runnableWIthLambda(){
        Runnable r= ()-> System.out.println("Newly created Thread. Runnable with lambda");
        new Thread(r).start();
        System.out.println("Original Thread with lambda");
    }

    public static void runnableWithLambdaShortestWay(){

        new Thread(
                ()-> System.out.println("Newly created Thread. Runnable with lambda shortest.")
        ).start();
        System.out.println("Original thread. runnable with lambda shortest");
    }
}

