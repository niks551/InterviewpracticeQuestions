package com.niks.main;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {

  public static void main(String[] args) {
    // String startTime = "2017-09-21 14:41";
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
    // LocalDateTime localDateTime = LocalDateTime.parse(startTime, formatter);
    //
    // System.out.println(localDateTime); // default, print ISO_LOCAL_DATE
    //
    // System.out.println(formatter.format(localDateTime));

   // Date date=new Date(str);

    String str = "2017-09-21 14:41";
    Date date=new Date(str);
    date.toGMTString();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
    System.out.println(dateTime.toInstant(ZoneOffset.of("+7")));
  }

}
