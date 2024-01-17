package com.zillow.exercise;
 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {

    static List<Person> sort(Iterable<Person> people, String sortField, String ascending){
        

        List<Person> persons = new ArrayList<>();
        people.forEach(persons::add);
        Comparator<Person> comparator = new PersonComparator(sortField);
        if ("false".equals(ascending)) {
            comparator = comparator.reversed();
        }
        Collections.sort(persons, comparator);
        return persons;
    }
}