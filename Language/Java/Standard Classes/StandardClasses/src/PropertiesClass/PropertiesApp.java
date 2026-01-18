package PropertiesClass;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/PropertiesClass/application.properties"));

            System.out.println(properties.getProperty("name.first"));
            System.out.println(properties.getProperty("name.last"));

            properties.put("hobby", "Coding");
            properties.store(new FileOutputStream("src/PropertiesClass/application.properties"), "Komentar");

        } catch (FileNotFoundException exception){
            System.out.println("file tidak ditemukan");
        } catch (IOException exception){
            System.out.println("Gagal load dari file");
        }
    }
}
