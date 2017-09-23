package com.niks.main;

/**
 * @author nchaduvula
 *
 */
public class Permutations {


  public static void main(String[] args) {
    int array[] = {1, 2, 3, 4, 5};
    boolean b[] = {false, false, false, false, false};

    int array2[] = {1, 2};
    boolean b2[] = {false, false};
    Permutations p = new Permutations();
    // p.printPermutations(array, 0, 4);
    p.printCombinations(array2, b2, 0, 1);
    p.printCombinations(array, b, 0, 4);
  }

  public void printPermutations(int[] array, int k, int n) {
    if (k == n) {
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
      }
      System.out.println("");
    } else {
      for (int i = k; i <= n; i++) {
        int temp = array[i];
        array[i] = array[k];
        array[k] = temp;
        printPermutations(array, k + 1, n);
        temp = array[i];
        array[i] = array[k];
        array[k] = temp;
      }
    }
  }


  /**
   * @param array
   * @param b
   * @param k
   * @param n
   */
  public void printCombinations(int[] array, boolean[] b, int k, int n) {
    if (k == n) {
      b[k] = false;
      printArray(array, b);
      b[k] = true;
      printArray(array, b);
      return;
    }
    b[k] = false;
    printCombinations(array, b, k + 1, n);
    b[k] = true;
    printCombinations(array, b, k + 1, n);

  }

  private void printArray(int[] array, boolean[] b) {
    for (int i = 0; i < array.length; i++) {
      if (b[i]) {
        System.out.print(array[i]);
      }
    }
    System.out.println("");
  }

}
