package toni.staticKeyword;

import static toni.staticKeyword.MathUtil.*;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(Application.PROCESSOR);

        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(sum(1, 2, 3, 4, 5, 6));

        Country.City city = new Country.City();
        city.setName("Tasik");
    }
}
