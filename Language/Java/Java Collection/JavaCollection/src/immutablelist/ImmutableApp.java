package immutablelist;

import data.Person;

import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        Person person = new Person("Code");

        person.addHobby("Coding");
        person.addHobby("Dota");

        for(var hobby : person.getHobbies()){
            System.out.println(hobby);
        }

        doSomethingWithHobbies(person.getHobbies());

        for(var hobby : person.getHobbies()){
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
       hobbies.add("ea");
    }
}
