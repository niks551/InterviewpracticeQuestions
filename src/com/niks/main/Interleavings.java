package com.niks.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author nchaduvula
 *
 */
public class Interleavings {

  public static void main(String[] args) {

    int[] list1 = {1, 2, 3};
    int[] list2 = {4, 5, 6};
    int list3[] = new int[list1.length + list2.length];

    System.out.println(list2.length);
    // printAllInterleavings(list1, list2, list3, 0, 0, 0);

    List<Integer> arraylist1 = new ArrayList<>();
    arraylist1.add(1);
    arraylist1.add(2);
    arraylist1.add(3);

    List<Integer> arraylist2 = new ArrayList<>();
    arraylist2.add(4);
    arraylist2.add(5);
    arraylist2.add(6);


    System.out.println("size of ArrayList" + arraylist2.size());


    List<Integer> arraylist3 = new ArrayList<>(arraylist1.size() + arraylist2.size());

    arraylist3.addAll(0, arraylist2);

    System.out.println("Size of arrayList" + arraylist3.size());

    // printLeavingswithArrayList(arraylist1, arraylist2, arraylist3);
    printAllInterleavings(list1, list2, list3, 0, 0, 0);

  }

  private static void printLeavingswithArrayList(List<Integer> arraylist1, List<Integer> arraylist2,
      List<Integer> arraylist3, int i, int j, int k) {
    if (k==(arraylist3.size()-1)) {
      for (Integer integer : arraylist3) {
        System.out.print(integer.toString());
      }
      System.out.println();
      return;
    }



  }

  private static void printAllInterleavings(int[] list1, int[] list2, int[] list3, int i, int j,
      int k) {
    if (k==((list1.length+list2.length)-1)) {
      for (int m = 0; m < list3.length; m++) {
        System.out.print(list3[m]);
      }
      System.out.println("");
      return;
    }

    // list1 is finished
    if (i == list1.length-1) {
      while (j == list2.length - 1) {
        list3[k++] = list2[j++];
      }
    }

    // list2 is finished
    if (j == list2.length-1) {
      while (i == list1.length - 1) {
        list3[k++] = list1[i++];
      }
    }

//    list3[k++]=list1[i++];
//    printAllInterleavings(list1, list2, list3, i--, j, k--);
//    list3[k++]=list1[j++];
//    printAllInterleavings(list1, list2, list3, i, j--, k--);


  }
}
