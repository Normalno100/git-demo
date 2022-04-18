package com.javacourse.se.lesson5;


import com.javacourse.se.lesson34.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       List<Person> list = new ArrayList<>();


        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");
        Person person3 = new Person("Rabbit suka");

        list.add(person1);
        list.add(person2);


        Iterator<Person> iterator = list.iterator();

        for (Person person: list
             ) {
            
        }


    }
}
