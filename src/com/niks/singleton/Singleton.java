package com.niks.singleton;

/**
 * Doesn't work for multiple Threads.. Only works for singleThreaded applications
 * 
 * @author nchaduvula
 * 
 */
public class Singleton {

  private static Singleton singleton = null;

  /**
   * No argument constructor
   */
  private Singleton() {

  }


  /**
   * Lazy Initialization
   * 
   * @return
   */
  public static Singleton getInstance() {
    if (singleton == null) {
      return new Singleton();
    }
    return null;
  }


}
