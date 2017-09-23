package com.niks.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExploreJava8 {

  public static void main(String[] args) {
    
    
    //Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
    

//    for (int i = 1; i < 16; i++) {
//      if (i % 3 == 0 && i % 5 == 0) {
//        System.out.println(i);
//      } else if (i % 3 == 0) {
//        System.out.println("Fizz");
//      } else if (i % 5 == 0) {
//        System.out.println("Buzz");
//      } else {
//        System.out.println(i);
//      }
//    }

    int sum = 0;
    for (int i = 1; i < 1000; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println(i);
      } else if (i % 3 == 0) {
        sum += i;
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        sum += i;
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
    int sum2=0;
    for (int i = 1; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum2+=i;
      } else{
        
      }
  
    }
    System.out.println("Sum of all multiples" + sum);
    System.out.println("Sum of all multiples" + sum2);
    
    List<String> cities = Arrays.asList("London", "HongKong", "Paris", "NewYork");
    List<String> capitalCities=cities.stream().map(city-> city.toUpperCase()).collect(Collectors.toList());
    
    capitalCities.forEach(c->{System.out.println("city in uppercase"+c);});
   
    
    
//Predicate<Integer> divideBy3=(p)->{
//  return (p%3==0?"Fizz":"");
//};
    
    IntStream.rangeClosed(1, 1000).forEach(i->{
     System.out.println(i*i);
    });
    
//    IntStream.rangeClosed(0, 100).mapToObj(
//                i -> i % 3 == 0 ?
//                (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
//                (i % 5 == 0 ? "Buzz" : i))
//        .forEach(System.out.println);

  }

}
