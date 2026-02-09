package data;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public Person(String name){
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    private String name;

    private List<String> hobbies;

    public void addHobby(String hobby){
        hobbies.add(hobby);
    }

    public List<String> getName() {
        return name;
    }
}
