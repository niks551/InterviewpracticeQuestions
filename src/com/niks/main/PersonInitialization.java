package com.niks.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonInitialization {

  public static void main(String[] args) {
    Person p = new Person("Nikhil", "abc", 12);
    Person p1 = new Person("Chai", "abdec", 20);
    Person p2 = new Person("tana", "fgh", 27);
    Person p3 = new Person("nina", "jkl", 10);
    Person p4 = new Person("sona", "abc", 5);
    Person p5 = new Person("potter", "nona", 26);

    List<Person> people = new ArrayList<Person>();
    people.add(p);
    people.add(p1);
    people.add(p2);
    people.add(p3);
    people.add(p4);
    people.add(p5);

    // Predicate<Person> pred = new Predicate<Person>() {
    //
    // @Override
    // public boolean test(Person p) {
    // return p.getAge() > 10;
    // }
    // };


    Predicate<Person> predic = (pers) -> pers.getAge() < 10;


    // Make as many predicates as possible
    people.forEach((Person) -> {
      if (predic.test(Person)) {
        System.out.println("Person FirstName" + Person.getFirstName() + "Age:" + Person.getAge());
      }
    });

  }

}
