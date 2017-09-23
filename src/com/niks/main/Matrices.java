package com.niks.main;

import java.util.LinkedList;

/**
 * @author nchaduvula<nchaduvula@salesforce.com>
 *
 */
public class Matrices {

  public class LinkedListnode {
    public int data;
    public LinkedListnode next;
    public LinkedListnode down;
  }

  public static void main(String[] args) {
    int row = 0;
    int column = 0;
    int matrix[][] = new int[4][4];
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;
    matrix[0][3] = 4;
    matrix[1][0] = 5;
    matrix[1][1] = 6;
    matrix[1][2] = 7;
    matrix[1][3] = 8;
    matrix[2][0] = 9;
    matrix[2][1] = 10;
    matrix[2][2] = 11;
    matrix[2][3] = 12;
    matrix[3][0] = 13;
    matrix[3][1] = 14;
    matrix[3][2] = 15;
    matrix[3][3] = 16;



    int matrix3[][] = new int[3][4];
    matrix3[0][0] = 1;
    matrix3[0][1] = 2;
    matrix3[0][2] = 3;
    matrix3[0][3] = 4;
    matrix3[1][0] = 5;
    matrix3[1][1] = 6;
    matrix3[1][2] = 7;
    matrix3[1][3] = 8;
    matrix3[2][0] = 9;
    matrix3[2][1] = 10;
    matrix3[2][2] = 11;
    matrix3[2][3] = 12;



    int matrix4[][] = new int[4][3];
    matrix4[0][0] = 1;
    matrix4[0][1] = 2;
    matrix4[0][2] = 3;
    matrix4[1][0] = 5;
    matrix4[1][1] = 6;
    matrix4[1][2] = 7;
    matrix4[2][0] = 9;
    matrix4[2][1] = 10;
    matrix4[2][2] = 11;
    matrix4[3][0] = 13;
    matrix4[3][1] = 14;
    matrix4[3][2] = 15;

    int matrix2[][] = new int[5][5];
    matrix2[0][0] = 1;
    matrix2[0][1] = 2;
    matrix2[0][2] = 3;
    matrix2[0][3] = 4;
    matrix2[0][4] = 91;
    matrix2[1][0] = 5;
    matrix2[1][1] = 6;
    matrix2[1][2] = 7;
    matrix2[1][3] = 8;
    matrix2[1][4] = 92;
    matrix2[2][0] = 9;
    matrix2[2][1] = 10;
    matrix2[2][2] = 11;
    matrix2[2][3] = 12;
    matrix2[2][4] = 93;
    matrix2[3][0] = 13;
    matrix2[3][1] = 14;
    matrix2[3][2] = 15;
    matrix2[3][3] = 16;
    matrix2[3][4] = 94;
    matrix2[4][0] = 80;
    matrix2[4][1] = 81;
    matrix2[4][2] = 82;
    matrix2[4][3] = 83;
    matrix2[4][4] = 95;
    Matrices matrixObject = new Matrices();
    // matrixObject.printMatrixInSpiralOrder(matrix);
    matrixObject.printMatrix(matrix3);
    // matrixObject.rotateMatrixninetyDegrees(matrix);
    // matrixObject.PrintSpiralForm(matrix, 4, 4);



    System.out.println("++++++++++++++++++++++++");
    // matrixObject.printMatrixSpiralOwn(matrix3);
    matrixObject.printMatrixDiagonally(matrix3);
    // for (int i = 0; i < 2; i++) {
    // matrixObject.rotateMatrixninetyDegreesAntiClockwiseOwn(matrix2);
    // }
    // // matrixObject.constructLinkedListFromMatrix(matrix);
    // matrixObject.printMatrix(matrix2);
    //
    //
    // matrixObject.rotateMatrixnentyDegreesClockwiseOwn(matrix2);
    // matrixObject.sumMatrix(matrix2);

    System.out.println(matrixObject.printMaximumProduct(matrix2));

  }

  /**
   * @param matrix
   * @return
   */
  private int printMaximumProduct(int[][] matrix) {
    int numberOfRows = matrix.length;
    int numberOfColumns = matrix[0].length;

    if (numberOfRows == 0 || numberOfColumns == 0) {
      return 0;
    }

    int minCache[][] = new int[numberOfRows][numberOfColumns];
    int maxCache[][] = new int[numberOfRows][numberOfColumns];

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[0].length; col++) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        if (row == 0 && col == 0) {
          minCache[row][col] = matrix[row][col];
          maxCache[row][col] = matrix[row][col];
        } else {
          minCache[row][col] = minCache[row - 1][col];
          maxCache[row][col] = minCache[row - 1][col];
        }

      }
    }


    return -1;
  }

  private void rotateMatrixnentyDegreesClockwiseOwn(int[][] matrix2) {
    // assuming it is a square matrix
    int numberofRows = matrix2.length;


  }

  private void PrintSpiralForm(int[][] matrix, int numberOfRows, int numberOfColumns) {

    int row = 0, column = 0;
    int lastRow = numberOfRows - 1;
    int lastColumn = numberOfColumns - 1;

    while (row <= lastRow && column <= lastColumn) {

      // TOP ROW
      for (int i = column; i <= lastColumn; i++) {
        System.out.print(matrix[column][i] + " ");
      }
      row++;


      // RIGHT MOST COLUMN
      for (int i = row; i <= lastRow; i++) {
        System.out.print(matrix[i][lastColumn] + " ");
      }
      lastColumn--;

      // BOTTOM ROW
      if (row <= lastRow) {
        for (int i = lastColumn; i >= column; i--) {
          System.out.print(matrix[lastRow][i] + " ");
        }
        lastRow--;

      }

      // LEFT MOST COLUMN(in reverse)
      if (column <= lastColumn) {
        for (int i = lastRow; i >= row; i--) {
          System.out.print(matrix[i][column] + " ");
        }
        column++;
      }
    }
  }

  private void constructLinkedListFromMatrix(int[][] matrix) {
    LinkedList<Integer> linkedlist = new LinkedList<>();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print("   " + matrix[i][j]);
      }
      System.out.println("");
    }

  }

  /**
   * @param matrix
   */
  public void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print("   " + matrix[i][j]);
      }
      System.out.println("");
    }
  }

  /**
   * @param matrix
   */
  private void rotateMatrixninetyDegrees(int[][] matrix) {
    int numberOfRowsandColumns = matrix.length;
    // int layer=numberOfRowsandColumns/2;
    for (int layer = 0; layer < numberOfRowsandColumns / 2; layer++) {
      int first = layer;
      int last = numberOfRowsandColumns - 1 - layer;
      for (int i = first; i < last; i++) {
        int offset = i - first;
        int top = matrix[first][i];
        matrix[first][i] = matrix[last - offset][first];
        matrix[last - offset][first] = matrix[last][last - offset];
        matrix[last][last - offset] = matrix[i][last];
        matrix[i][last] = top;
      }
    }
    printMatrix(matrix);
  }



  private void rotateMatrixninetyDegreesAntiClockwiseOwn(int[][] matrix) {
    int numberOfRowsandColumns = matrix.length;
    for (int layer = 0; layer < numberOfRowsandColumns / 2; layer++) {
      int top = layer;
      int right = layer;
      int bottom = numberOfRowsandColumns - 1 - layer;
      int left = numberOfRowsandColumns - 1 - layer;
      while (top < numberOfRowsandColumns - 1 - layer) {
        int temp = matrix[layer][top];
        matrix[layer][top] = matrix[right][numberOfRowsandColumns - 1 - layer];
        matrix[right][numberOfRowsandColumns - 1 - layer] =
            matrix[numberOfRowsandColumns - 1 - layer][bottom];
        matrix[numberOfRowsandColumns - 1 - layer][bottom] = matrix[left][layer];
        matrix[left][layer] = temp;
        top++;
        right++;
        bottom--;
        left--;
      }
    }
  }


  private void printMatrixSpiralOwn(int[][] matrix) {
    int numberOfRows = matrix.length;
    int numberOfColumns = matrix[0].length;
    for (int layer = 0; layer <= numberOfRows / 2; layer++) {
      int top = layer;
      int right = layer;
      int bottom = numberOfColumns - 1 - layer;
      int left = numberOfRows - 1 - layer;
      while (top <= numberOfColumns - 1 - layer) {
        System.out.print(matrix[layer][top] + " ");
        top++;
      }
      while (right <= numberOfRows - 1 - layer) {
        System.out.print(matrix[right][numberOfColumns - 1 - layer] + " ");
        right++;
      }
      while (bottom >= layer) {
        System.out.print(matrix[numberOfRows - 1 - layer][bottom] + " ");
        bottom--;
      }
      while (left >= layer) {
        System.out.print(matrix[left][layer] + " ");
        left--;
      }
    }

  }


  public void printMatrixDiagonally(int[][] matrix) {
    int numberOfRows = matrix.length;
    int numberOfColumns = matrix[0].length;
    // int diagnolMaximumLength=Math.max(numberOfRows, numberOfColumns)
    for (int i = 0; i < numberOfRows; i++) {
      int row = i;
      int column = 0;
      while (row >= 0) {
        System.out.print(matrix[row][column] + " ");
        row--;
        column++;
      }
    }
    for (int j = 1; j < numberOfColumns; j++) {
      int row = numberOfRows - 1;
      int col = j;
      while (col < numberOfColumns) {
        System.out.print(matrix[row][col] + " ");
        row--;
        col++;
      }
    }
  }


}
