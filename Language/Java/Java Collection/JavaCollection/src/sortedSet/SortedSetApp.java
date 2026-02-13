package sortedSet;

import data.Person;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people =  new TreeSet<>(new PersonComparator());
        people.add(new Person("Budi"));
        people.add(new Person("Joko"));
        people.add(new Person("Bowo"));

        for(var person : people){
            System.out.println(person.getName());
        }
    }
}
