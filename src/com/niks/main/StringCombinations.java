package com.niks.main;

import java.util.ArrayList;

/**
 * @author nchaduvula<nchaduvula@salesforce.com>
 *
 */
public class StringCombinations {

  public static void main(String[] args) {

    String str = "01?0??1?10?1001";
    StringCombinations strCombinationObject = new StringCombinations();
    strCombinationObject.printCombinations(str);
  }

  /**
   * @param str
   * @return
   */
  private void printCombinations(String str) {
    ArrayList<Integer> qmIndexList = getQuestionMarkPositions(str);
    for (int i = -1; i < qmIndexList.size(); i++) {
      char[] temp = str.toCharArray();
      int j = 0;
      while (j <= i) {
        temp[qmIndexList.get(j)] = '1';
        j++;
      }
      for (int k = j; k < qmIndexList.size(); k++) {
        temp[qmIndexList.get(k)] = '0';
      }
      
      System.out.println(new String(temp));
    }
  }



  public ArrayList<Integer> getQuestionMarkPositions(String str) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '?') {
        arrayList.add(i);
      }
    }
    return arrayList;
  }
}


