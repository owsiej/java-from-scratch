import java.util.*;

class Scratch {
    public static void main(String[] args) {
        List<String> rentedCars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Boolean> carsToRentWithStatus = new HashMap<>();
        carsToRentWithStatus.put("Toyota", false);
        carsToRentWithStatus.put("Jaguar", true);
        carsToRentWithStatus.put("Mazda", true);
        carsToRentWithStatus.put("Jeep", false);
        carsToRentWithStatus.put("Opel", false);
        carsToRentWithStatus.put("Seat", true);
        carsToRentWithStatus.put("BMW", true);
        carsToRentWithStatus.put("Mercedes", true);
        while (true) {
            System.out.println();
            System.out.println("Podaj opcję");
            System.out.println("1. Wyświetl wszystkie samochody");
            System.out.println("2. Wyświetl tylko dostępne samochody");
            System.out.println("3. Wyświetl wypożyczone przeze mnie samochody");
            System.out.println("4. Wypożycz samochód");
            System.out.println("5. Wyjdź.");
            System.out.println();
            int userInput = scanner.nextInt();
            scanner.nextLine();
            switch (userInput) {
                case 1 -> {
                    for (Map.Entry<String, Boolean> set : carsToRentWithStatus.entrySet()) {
                        String isAvailable = set.getValue() ? "Available" : "Unavailable";
                        System.out.println(set.getKey() + ": " + isAvailable);
                    }
                }
                case 2 -> {
                    for (Map.Entry<String, Boolean> set : carsToRentWithStatus.entrySet()) {
                        if (set.getValue()) {
                            System.out.println(set.getKey());
                        }
                    }
                }
                case 3 -> System.out.println(rentedCars);
                case 4 -> {
                    if (rentedCars.size() == 3) {
                        System.out.println("Nie możesz wypożyczyć więcej niż 3 samochody");
                    } else {
                        System.out.println("Podaj nazwę samochodu do wypożyczenia");
                        String input = scanner.nextLine();
                        if (carsToRentWithStatus.get(input)) {
                            rentedCars.add(input);
                            carsToRentWithStatus.put(input, false);
                        } else {
                            System.out.println("Nie możesz wypożyczyć tego samochodu");
                        }
                    }
                }
                case 5 -> System.exit(0);


            }

        }
    }
}