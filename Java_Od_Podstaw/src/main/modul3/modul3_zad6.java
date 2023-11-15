import java.util.*;

class Scratch {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj opcję");
            System.out.println("1. Dodaj imie");
            System.out.println("2. Usuń imię");
            System.out.println("3. Wyświetl imiona");
            System.out.println("4. Zakończ");
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1 -> {
                    System.out.println("Podaj imię które chcesz dodać");
                    String newName = scanner.nextLine();
                    names.add(newName);
                }
                case 2 -> {
                    System.out.println("Podaj imię które chcesz usunąć");
                    String newName = scanner.nextLine();
                    names.removeIf(newName::equals);
                }
                case 3 -> System.out.println(names);
                case 4 -> System.exit(0);
            }
        }
    }
}