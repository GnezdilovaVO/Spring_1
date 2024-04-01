package org.example;

import com.google.gson.Gson;
import org.example.person.Person;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Person 1", "Person 11", 22);
        for (int i = 1; i < 6; i++) {
            Person person = new Person();
            person.setFirstName("Person " + i);
            person.setLastName("Person " + (i + 10));
            person.setAge(ThreadLocalRandom.current().nextInt(18, 25));
            System.out.println(person);

            Gson gson = new Gson();
            String json = gson.toJson(person);
            System.out.println(json);
            Person result = gson.fromJson(json, Person.class);
            System.out.println(result);

        }



    }
}