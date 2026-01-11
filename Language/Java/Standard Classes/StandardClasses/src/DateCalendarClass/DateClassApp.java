package DateCalendarClass;

import java.util.Date;

public class DateClassApp {
    public static void main(String[] args) {
        Date date = new Date();
        long millisecond = date.getTime();

        System.out.println(date);
        System.out.println(millisecond);

    }
}
