package com.niks.main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.IntStream;

import javax.sql.rowset.Predicate;

/**
 * @author nchaduvula
 *
 */
public class SEeight {


  // Iterator consumer, Runnable,Cloneable
  // Predicate

  // Wow predicate is super useful

  public static void main(String[] args) {


    int a = 0, b = 0, c = 0;

    int d = a > b ? a > c ? a : c : b > c ? b : c;



    List<String> strings2 = new ArrayList<>();
    strings2.add("aaa");
    strings2.add("AAA");
    strings2.add("abd");
    strings2.add("ABD");
    strings2.add("BGH");

    // String str = "abc";
    List<String> strings = new ArrayList<>();
    strings.add("aaa");
    strings.add("abc");
    strings.add("abd");
    strings.add("efg");



    Comparator<String> c1 = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
      }
    };

    Comparator<String> comp = (str1, str2) -> {
      return str1.compareToIgnoreCase(str2);
    };

    for (String string : strings2) {
      System.out.println(string);
    }
    System.out.println("+++++++++++++++++++++++");
    Collections.sort(strings2, c1);
    // for (String string : strings2) {
    // System.out.println(string);
    // }
    strings2.forEach(str -> {
      str = str.concat("abce");
      System.out.println(str);
    });
    System.out.println("+++++++++++++++++++++++");
    for (String string : strings2) {
      System.out.println(string);
    }

    SEeight s8obj = new SEeight();
    System.out.println(Integer.MAX_VALUE);
    // System.out.println(s8obj.largestPrimeFactor(600851475143));


    HashMap<String, Integer> hm = new HashMap<>();
    Hashtable<String, Integer> ht = new Hashtable<>();
  }


  // public BigInteger largestPrimeFactor(BigInteger n) {
  // BigInteger i = n;
  // while (i < n / 2) {
  // if (n % i == 0 && isPrime(i)) {
  // return i;
  // }
  // i = i - 1;
  // }
  // return -1;
  // }
  //
  // public boolean isPrime(BigInteger n) {
  // for (long i = 1; i < n / 2; i++) {
  // if (n % i == 0)
  // return false;
  // else
  // return true;
  // }
  // return false;
  // }

}
