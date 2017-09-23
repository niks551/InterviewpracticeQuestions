package com.niks.main;

import java.util.Comparator;

/**
 * @author nchaduvula
 *
 */
public class Timeframe implements Comparable<Timeframe> {


  private int checkinTime;

  private int checkoutTime;

  public int getCheckinTime() {
    return checkinTime;
  }

  public void setCheckinTime(int checkinTime) {
    this.checkinTime = checkinTime;
  }

  public int getCheckoutTime() {
    return checkoutTime;
  }

  public void setCheckoutTime(int checkoutTime) {
    this.checkoutTime = checkoutTime;
  }

  public Timeframe(int checkinTime, int checkoutTime) {
    super();
    this.checkinTime = checkinTime;
    this.checkoutTime = checkoutTime;
  }

  @Override
  public String toString() {
    return "Timeframe [checkinTime=" + checkinTime + ", checkoutTime=" + checkoutTime + "]";
  }

  // @Override
  // public int compare(Timeframe t1, Timeframe t2) {
  // if (t1.getCheckinTime() == t2.getCheckinTime()) {
  // return t1.getCheckoutTime() < t2.getCheckoutTime() ? t1.getCheckoutTime()
  // : t2.getCheckoutTime();
  // } else if (t1.getCheckinTime() < t2.getCheckinTime()) {
  // return t1.getCheckinTime();
  // } else {
  // return t2.checkinTime;
  // }
  // }

  @Override
  public int compareTo(Timeframe t1) {
    if (this.getCheckinTime() == t1.getCheckinTime()) {
      return this.getCheckoutTime() < t1.getCheckoutTime() ? -1 : 1;
    } else if (this.getCheckinTime() < t1.getCheckinTime()) {
      return -1;
    } else {
      return 1;
    }

  }



}
