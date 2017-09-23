package com.niks.main;

/**
 * @author nchaduvula
 * 
 */
public class MultiThreading implements Runnable {

  static int number = 1;

  public static void main(String[] args) throws InterruptedException {
    // Thread evenThread=new Thread();
    // Thread oddThread=new Thread();
    // evenThread.start();
    // evenThread.wait();
    // oddThread.start();
    // oddThread.notify();
    System.out.println("number in MainThread is " + number);
    Thread t = new Thread(new MultiThreading());
    t.setName("First Thread");
    t.start();
    Thread t2 = new Thread(new MultiThreading());
    t2.setName("Second Thread");
    t2.start();
    //System.out.println("Raaa raa");
  }

  @Override
  public void run() {
    // TODO Auto-generated method stub
    while (number < 10) {
      try {
        Thread.currentThread().wait();
      } catch (InterruptedException e) {
        printEvenNumbers();
        e.printStackTrace();
      }
     
    }
  }
  
  public synchronized void printEvenNumbers(){
    System.out.println("number in "+Thread.currentThread().getName()+number++);
  }
  
}
