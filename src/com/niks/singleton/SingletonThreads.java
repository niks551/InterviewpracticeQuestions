package com.niks.singleton;

/**
 * @author nchaduvula<nchaduvula@salesforce.com>
 * 
 */
public class SingletonThreads {

  private static SingletonThreads singleton = null;

  private SingletonThreads() {

  }

  /**
   * @return
   */
  public static SingletonThreads getInstance() {
    synchronized (SingletonThreads.class) {
      if (singleton == null) {
        singleton = new SingletonThreads();
      }
    }
    return singleton;
  }

}
