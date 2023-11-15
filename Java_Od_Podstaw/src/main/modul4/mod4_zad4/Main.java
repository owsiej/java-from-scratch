package main.modul4.mod4_zad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj miesiac");
        String userInput = scanner.nextLine();

        System.out.println(Months.valueOf(userInput.toUpperCase()).getDaysOfMonth());
    }
}
