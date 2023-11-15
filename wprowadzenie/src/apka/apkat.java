package apka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class apkat {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
// konstruktor obiektu, tutaj uzywamy konstruktora domyślnego, pusty konstruktor
        Party party = new Party();



        while (shouldContinue) {
            System.out.println("Wybierz opcję");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Wyjście");

            try {
                int userChoice = scanner.nextInt();

                switch (userChoice) {
                    case 1 -> party.displayGuests();
                    case 2 -> party.addGuest();
                    case 3 -> party.displayMeals();
                    case 4 -> party.displayGuestByPhoneNumber();
                    case 5 -> shouldContinue = false;
                }
            } catch (InputMismatchException e1) {
                System.out.println("Wrong input.");
                scanner.next();
                }

            }
        }
    }

