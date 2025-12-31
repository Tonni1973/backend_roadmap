package toni.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithTryResource {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/toni/trywithresource/README.md"))){
            while(true) {
                String text = reader.readLine();
                if(text == null) {
                    break;
                }
                System.out.println(text);
            }
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
