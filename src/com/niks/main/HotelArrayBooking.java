package com.niks.main;

import java.util.Arrays;

/**
 * @author nchaduvula
 *
 */
public class HotelArrayBooking {

  public static void main(String[] args) {
    // Timeframe t1 = new Timeframe(1, 3);
    // Timeframe t2 = new Timeframe(2, 5);
    // Timeframe t3 = new Timeframe(2, 7);
    // Timeframe t4 = new Timeframe(6, 8);
    // // Timeframe t5 = new Timeframe(2, 4);

    // Timeframe[] arrayOfTimeframes = {t1, t2, t3, t4};

    Timeframe t1 = new Timeframe(1, 4);
    Timeframe t2 = new Timeframe(2, 5);
    Timeframe t3 = new Timeframe(10, 12);
    Timeframe t4 = new Timeframe(5, 9);
    Timeframe t5 = new Timeframe(5, 12);

    Timeframe[] arrayOfTimeframes = {t1, t2, t3, t4, t5};


    Timeframe t6 = new Timeframe(2, 5);
    Timeframe t7 = new Timeframe(1, 3);
    Timeframe t8 = new Timeframe(4, 7);

    // Timeframe[] arrayOfTimeframes = {t6, t7, t8};

    for (Timeframe timeframe : arrayOfTimeframes) {
      System.out.println("Timeframes:" + timeframe);
    }

    System.out.println("++++++++++++++++++++++++");

    Arrays.sort(arrayOfTimeframes);

    for (Timeframe timeframe : arrayOfTimeframes) {
      System.out.println("Timeframes:" + timeframe);
    }


    int j = 0;
    Timeframe t2checkoutTimeCheckPoint = arrayOfTimeframes[j];
    int numberOfTimeFrames = arrayOfTimeframes.length;
    int minimumNumberOfRoomsRequired = 0;
    int MaxroomsRequired = Integer.MIN_VALUE;

    for (int i = 0; i < numberOfTimeFrames; i++) {
      if (arrayOfTimeframes[i].getCheckinTime() < t2checkoutTimeCheckPoint.getCheckoutTime()) {
        minimumNumberOfRoomsRequired++;
        if (minimumNumberOfRoomsRequired > MaxroomsRequired) {
          MaxroomsRequired = minimumNumberOfRoomsRequired;
        }
      } else if (arrayOfTimeframes[i].getCheckinTime() > t2checkoutTimeCheckPoint
          .getCheckoutTime()) {
        minimumNumberOfRoomsRequired--;
        t2checkoutTimeCheckPoint = arrayOfTimeframes[j];
        j = j + 1;
      } else {
        t2checkoutTimeCheckPoint = arrayOfTimeframes[j++];
      }
    }

    System.out.println("Number Of hotel rooms Required" + MaxroomsRequired);
    System.out.println("j value"+j);

  }

}
