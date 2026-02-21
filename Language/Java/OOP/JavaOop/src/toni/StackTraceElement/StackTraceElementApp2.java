package toni.StackTraceElement;

import org.w3c.dom.ls.LSOutput;

public class StackTraceElementApp2 {
    public static void main(String[] args) {
        try{
            String[] names = {
                    "Budi", "Budiana", "Ahmad"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraces = throwable.getStackTrace();

            throwable.printStackTrace();
        }

        System.out.println("naon eta");
    }

}
