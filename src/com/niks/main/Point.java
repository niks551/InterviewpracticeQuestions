package com.niks.main;

public class Point {


  private int xcoordinate;

  private int ycoordinate;

  public int getXcoordinate() {
    return xcoordinate;
  }

  public void setXcoordinate(int xcoordinate) {
    this.xcoordinate = xcoordinate;
  }

  public int getYcoordinate() {
    return ycoordinate;
  }

  public void setYcoordinate(int ycoordinate) {
    this.ycoordinate = ycoordinate;
  }

  public Point(int xcoordinate, int ycoordinate) {
    super();
    this.xcoordinate = xcoordinate;
    this.ycoordinate = ycoordinate;
  }

  @Override
  public String toString() {
    return "Point [xcoordinate=" + xcoordinate + ", ycoordinate=" + ycoordinate + "]";
  }


}
