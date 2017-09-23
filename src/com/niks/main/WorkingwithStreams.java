package com.niks.main;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class WorkingwithStreams {

  public static void main(String[] args) {
    List<Person> peopleList = new ArrayList<>();

    peopleList.add(new Person("Naveen", "Jaini", 50));
    peopleList.add(new Person("Nikhilesh", "Chaduvula", 27));
    peopleList.add(new Person("Arun", "Costa", 50));
    peopleList.add(new Person("Venkana", "Goudar", 50));

    Person[] personArray =
        {new Person("Naveen", "Jaini", 50), new Person("Nikhilesh", "Chaduvula", 10),
            new Person("Venkana", "Goudar", 50), new Person("Arun", "Costa", 50)};

    Predicate<Person> agePredicateGreaterThan27 = (p) -> {
      return p.getAge() > 27;
    };

    Stream<Person> streamForPersons = Stream.of(personArray).filter(agePredicateGreaterThan27);
    streamForPersons.forEach(p -> {
      System.out.println("First Name: " + p.getFirstName() + " Last Name: " + p.getLastName()
          + " Age: " + p.getAge());
    });

    long countOfthePredicateStream = peopleList.stream().filter(agePredicateGreaterThan27).count();

    OptionalDouble averageOfthePredicateStream =
        peopleList.stream().filter(agePredicateGreaterThan27).mapToInt(p -> p.getAge()).average();

    OptionalDouble the95ThPercentile =
        peopleList.stream().filter(agePredicateGreaterThan27).mapToInt(p -> p.getAge()).average();
    Instant startInstant = Instant.now();
    if (averageOfthePredicateStream.isPresent()) {
      System.out.println(averageOfthePredicateStream.getAsDouble());
    } else {
      System.out.println("Average couldn't be calculated");
    }
    Instant endInstant = Instant.now();
    Duration elapsedTime = Duration.between(startInstant, endInstant);

    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    LocalDateTime localDateTime = LocalDateTime.now();

    LocalDate specifiedDate=LocalDate.of(2015, 12, 1);
    
    

    // TimeZones


  }

}
