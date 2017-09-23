package com.niks.main;

import java.util.Stack;

/**
 * @author nchaduvula
 *
 */
public class MaxHistogram {

  public static void main(String[] args) {
    int a[] = {1, 2, 3, 4};
    int b[] = {5, 3, 1, 2};
    int c[] = {4, 9, 1, 5};
    MaxHistogram histogramObject = new MaxHistogram();
    System.out.println(histogramObject.getMaximumAreaHistogramValue(a));
    System.out.println(histogramObject.getMaximumAreaHistogramValue(b));
    System.out.println(histogramObject.getMaximumAreaHistogramValue(c));
  }

  public int getMaximumAreaHistogramValue(int[] a) {
    int currentRectangleSum=0;
    int maxRectangleSum=0;
    Stack<Integer> heights=new Stack<Integer>();
    Stack<Integer> positions=new Stack<Integer>();

}
