package set;

import java.util.EnumSet;

public class EnumSetApp {
    public static void main(String[] args) {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);

        for(var gender: genders){
            System.out.println(gender);
        }
    }

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

}
