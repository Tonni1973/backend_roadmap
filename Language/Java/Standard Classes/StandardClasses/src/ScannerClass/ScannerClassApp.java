package ScannerClass;

import java.util.Scanner;

public class ScannerClassApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.println("Hello "+ name);

    }
}
