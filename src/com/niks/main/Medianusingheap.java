package com.niks.main;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Medianusingheap {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];

    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
      System.out.println(getMedian(a)[a_i]);
      // System.out.println()
    }

  }

  public static double[] getMedian(int[] a) {
    PriorityQueue<Integer> minHeapForHigherNumbers = new PriorityQueue<Integer>();
    Comparator<Integer> c = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return (-1) * (o1.compareTo(o2));
      }
    };
    PriorityQueue<Integer> maxHeapForLowerNumber = new PriorityQueue<>(c);
    double[] medians = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      addNumber(a[i], minHeapForHigherNumbers, maxHeapForLowerNumber);
      rebalance(minHeapForHigherNumbers, maxHeapForLowerNumber);
      medians[i] = getMedian(minHeapForHigherNumbers, maxHeapForLowerNumber);
    }
    return medians;
  }

  private static double getMedian(PriorityQueue<Integer> minHeapForHigherNumbers,
      PriorityQueue<Integer> maxHeapForLowerNumber) {
    PriorityQueue<Integer> biggerHeap =
        minHeapForHigherNumbers.size() > maxHeapForLowerNumber.size() ? minHeapForHigherNumbers
            : maxHeapForLowerNumber;
    PriorityQueue<Integer> smallerHeap =
        minHeapForHigherNumbers.size() > maxHeapForLowerNumber.size() ? maxHeapForLowerNumber
            : minHeapForHigherNumbers;
    if (biggerHeap.size() == smallerHeap.size()) {
      return (double) (smallerHeap.peek() + biggerHeap.peek()) / 2;
    } else {
      return biggerHeap.peek();
    }
  }

  private static void rebalance(PriorityQueue<Integer> minHeapForHigherNumbers,
      PriorityQueue<Integer> maxHeapForLowerNumber) {
    PriorityQueue<Integer> biggerHeap =
        minHeapForHigherNumbers.size() > maxHeapForLowerNumber.size() ? minHeapForHigherNumbers
            : maxHeapForLowerNumber;
    PriorityQueue<Integer> smallerHeap =
        minHeapForHigherNumbers.size() > maxHeapForLowerNumber.size() ? maxHeapForLowerNumber
            : minHeapForHigherNumbers;
    while (!((biggerHeap.size() - smallerHeap.size()) <= 1)) {
      smallerHeap.add(biggerHeap.poll());
    }
  }

  private static void addNumber(int i, PriorityQueue<Integer> minHeapForHigherNumbers,
      PriorityQueue<Integer> maxHeapForLowerNumber) {
    if (maxHeapForLowerNumber.isEmpty() || i < maxHeapForLowerNumber.peek()) {
      maxHeapForLowerNumber.add(i);
    } else {
      minHeapForHigherNumbers.add(i);
    }
  }



}
