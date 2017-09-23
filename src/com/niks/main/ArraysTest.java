package com.niks.main;

import java.util.stream.Stream;

public class ArraysTest {


  public static void main(String[] args) {
    int array1[] = {99, 94, 92};
    int array2[] = {99, 94, 92, 96, 97};
    int array3[] = {99, 94, 92, 96, 97, 98};
    int array4[] = {4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2};

    int array5[] = {1, 2, 3, 4};
    int array6[] = {9, 9, 9, 9};

    ArraysTest a = new ArraysTest();
    // Important
    // a.rotateArrayLeft(array3, 4);
    // a.printArray(array3);


    // Stream<Integer> str=.of(array5);
    Stream<int[]> streamInteger = Stream.of(array5);

    // a.kadanesAlgorithm(array4);
    int k[] = a.incrementArrayByOne(array6);
    for (int j = 0; j < k.length; j++) {
      System.out.print(k[j]);
    }
    // Streams for Arrays
    // Stream<Integer> streamForInteger= Array
    // int MAX_VALUE
  }

  private void kadanesAlgorithm(int[] a) {

    // Kadanes algorithm is useful to findout the maximum subarray sum from an entire array
    // It can also give us the index locations of where the max sum subarray has started and where
    // it has ended

    // int array4[] = {4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2};

    // Initially we start with zeroth location
    int max_so_far = a[0];
    int max_ending_here = 0;

    int startIndex = 0, endIndex = 0, s = 0;

    for (int i = 0; i < a.length; i++) {
      // Most important step here
      max_ending_here = max_ending_here + a[i];
      if (max_ending_here > max_so_far) {
        max_so_far = max_ending_here;
        startIndex = s;
        endIndex = i;
      }

      if (max_ending_here < 0) {
        max_ending_here = 0;
        s = i + 1;
      }

    }
    System.out.println("Maximum sum subarray in the main array is" + max_so_far);
    System.out.println("Start Index" + startIndex);
    System.out.println("End Index" + endIndex);
  }

  private void printArray(int[] array1) {
    for (int i = 0; i < array1.length; i++) {
      System.out.println(array1[i]);
    }
  }

  /**
   * @param array1
   * @param n
   */
  public void rotateArrayLeft(int[] array1, int n) {
    reverseArray(array1, 0, n - 1);
    reverseArray(array1, n, array1.length - 1);
    reverseArray(array1, 0, array1.length - 1);
  }



  public void reverseArray(int[] array1, int low, int high) {
    while (low < high) {
      int temp = array1[low];
      array1[low] = array1[high];
      array1[high] = temp;
      low++;
      high--;
    }
  }


  public int[] incrementArrayByOne(int[] a) {
    int carry = 1;
    for (int i = a.length - 1; i >= 0; i--) {
      if (carry == 1 && i == 0 && a[i] == 9) {
        a[i] = 0;
        return getnewArrayOfSizePlusOne(a);
      }
      a[i] = a[i] + carry;
      if (a[i] >= 10) {
        carry = 1;
        a[i] = a[i] % 10;
      } else {
        return a;
      }
    }
    return a;
  }


  public int[] getnewArrayOfSizePlusOne(int[] a) {
    int[] newarray = new int[a.length + 1];
    int j = 1;
    for (int i = 0; i < a.length; i++) {
      newarray[j++] = a[i];
    }
    newarray[0] = 1;
    return newarray;
  }

}
