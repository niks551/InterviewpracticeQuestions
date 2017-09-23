package com.niks.main;

import java.util.Arrays;

public class LargestPrimeFactor {

  public static int largestPrimeFactor(long number) {
    int i;

    for (i = 2; i <= number; i++) {
      if (number % i == 0) {
        number /= i;
        i--;
      }
    }

    return i;
  }

  public static void main(String[] args) {
    LargestPrimeFactor lpf = new LargestPrimeFactor();
    lpf.printAllPrimes(50, new boolean[50]);
    // System.out.println(LargestPrimeFactor.largestPrimeFactor(600851475143l));
  }


  /**
   * @param n
   * @param arrayOfNumbers
   */
  public void printAllPrimes(int n, boolean arrayOfNumbers[]) {
    arrayOfNumbers[0] = true;
    for (int i = 2; i < Math.sqrt(n); i++) {
      for (int j = 2; j < n; j++) {
        if (i * j >= n) {
          break;
        } else {
          // System.out.println(i*j);
          arrayOfNumbers[i * j] = true;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      if (!arrayOfNumbers[i]) {
        System.out.println(i );
      }
    }
    // Divisibility By 2

    // Divisibility by 3

    // Divisibility by 5

    // Divisibility by 7

    // Divisibilty by 9



  }


}
