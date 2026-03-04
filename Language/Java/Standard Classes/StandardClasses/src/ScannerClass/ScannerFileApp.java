package ScannerClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileApp {
    public static void main(String[] args) {

        try{
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String baris = scanner.nextLine();
                System.out.println(baris);
            }

            scanner.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("file tidak ditemukan");
        }

        System.out.println("Woi");

    }
}
