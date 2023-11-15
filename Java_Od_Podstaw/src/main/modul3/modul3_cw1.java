package main.modul3;

import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        int liczba1 = scanner.nextInt();

        System.out.println("Podaj drugą liczbę");
        int liczba2 = scanner.nextInt();

        System.out.println("Wynik dodawania to: " + (liczba1 + liczba2));
        System.out.println("Wynik odejmowania to: " + (liczba1 - liczba2));
        System.out.println("Wynik mnożenia to: " + (liczba1 * liczba2));
        System.out.println("Wynik dzielenia to: " + (liczba1 / liczba2));


    }
}