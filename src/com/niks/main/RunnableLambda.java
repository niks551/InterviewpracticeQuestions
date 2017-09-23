package com.niks.main;

public class RunnableLambda {

  public static void main(String[] args) {
//    Runnable r1 = new Runnable() {
//      @Override
//      public void run() {
//        try {
//          Thread.sleep(1);
//        } catch (InterruptedException e) {
//          e.printStackTrace();
//        }
//        System.out.println("Running thread 1");
//
//      }
//    };
//    Runnable r2 = new Runnable() {
//      @Override
//      public void run() {
//        System.out.println("Running thread 2");
//
//      }
//    };
//
//    new Thread(r1).start();
//    new Thread(r2).start();


    // USING LAMBDA EXPRESSIONS
    new Thread(() -> {
      try {
        Thread.sleep(12);
      } catch (Exception e) {
        e.printStackTrace();
      }
      System.out.println("Running thread 3");
      System.out.println("HelloWorld");
    }).start();


  }

}
