/**
 * 
 */
package com.niks.main;

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
//    int matrix[][] = new int[4][4];
//    matrix[0][0] = 1;
//    matrix[0][1] = 2;
//    matrix[0][2] = 3;
//    matrix[0][3] = 4;
//    matrix[1][0] = 5;
//    matrix[1][1] = 6;
//    matrix[1][2] = 7;
//    matrix[1][3] = 8;
//    matrix[2][0] = 9;
//    matrix[2][1] = 10;
//    matrix[2][2] = 11;
//    matrix[2][3] = 12;
//    matrix[3][0] = 13;
//    matrix[3][1] = 14;
//    matrix[3][2] = 15;
//    matrix[3][3] = 16;
//    int n = matrix.length;
//    System.out.println(matrix.length);
    
    Scanner in = new Scanner(System.in);
    int numberOfRowsOrColumns = in.nextInt();
    
    int matrix[][]=new int[numberOfRowsOrColumns][numberOfRowsOrColumns];
    int i=0;
    int j=0;
    for (int k = 1; i < numberOfRowsOrColumns; i++) {
        

        }
    
    Solution solutionobject = new Solution();
    System.out.println(solutionobject.getAbsoulteDifferenceOfDiagnols(matrix, numberOfRowsOrColumns));
  }

  public int getAbsoulteDifferenceOfDiagnols(int[][] matrix, int n) {
    int row = 0;
    int column = n - 1;
    int leftDiagnolSum = 0;
    int rightDiagnolSum = 0;
    while (row <= n - 1 && column >= 0) {
      leftDiagnolSum += matrix[row][row];
      row++;
      rightDiagnolSum += matrix[column][column];
      column--;
    }
//    System.out.println(leftDiagnolSum);
//    System.out.println(rightDiagnolSum);
    return Math.abs(leftDiagnolSum - rightDiagnolSum);
  }
}
