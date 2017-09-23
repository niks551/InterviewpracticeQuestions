package com.niks.main;

public class LongestIncreasingSubSequence {

  public static void main(String[] args) {
    int a[] = {1, 8, 6, 9, 2, 3, 5, 10};
    LongestIncreasingSubSequence object = new LongestIncreasingSubSequence();
    object.longestIncreasingSubseq(a);
  }

  /**
   * @param a
   */
  private void longestIncreasingSubseq(int[] a) {
    // We use dynamic programming to solve this
    // Initialize a new array where in we store the length of longest increasing subsequence as we
    // iterate through the array
    int[] longIncreaseCount = new int[a.length];
    // Initialize longIncreaseCount=1 because every element is counted by itself for
    // longestIncreasingCount
    for (int i = 0; i < longIncreaseCount.length; i++) {
      longIncreaseCount[i] = 1;
    }
    for (int i = 1; i < a.length; i++) {
      int j = 0;
      while (j < i) {
        if (a[j] < a[i]) {
          longIncreaseCount[i] = Math.max(longIncreaseCount[i], longIncreaseCount[j] + 1);
        }
        j++;
      }
    }
    int longestCount = 0;
    for (int i = 0; i < longIncreaseCount.length; i++) {
      if (longestCount < longIncreaseCount[i]) {
        longestCount = longIncreaseCount[i];
      }
    }
    System.out.println(longestCount);
  }

}
