package PropertiesClass;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("StandardClasses/src/PropertiesClass/application.properties"));

            System.out.println(properties.getProperty("name.first"));
            System.out.println(properties.getProperty("hobby"));
            System.out.println(properties.getProperty("name.last"));


            properties.put("hobby2", "Dota");
            properties.store(new FileOutputStream("StandardClasses/src/PropertiesClass/application.properties"), "Komenter?");

        } catch (FileNotFoundException exception){
            System.out.println("file tidak ditemukan");
        } catch (IOException exception){
            System.out.println("Gagal load dari file");
        }
    }
}
