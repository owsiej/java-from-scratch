import java.util.*;

class Scratch {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile imion chcesz podać?");
        int namesCount = scanner.nextInt();
        scanner.nextLine();

        int womenNamesCount =0;
        int menNamesCount=0;
        for (int i=0; i<namesCount; i++) {
            System.out.println("Podaj imię");
            String inputName = scanner.nextLine();
            if (inputName.endsWith("a")) {
                womenNamesCount++;
            } else {
                menNamesCount++;
            }
            names.add(inputName);
        }
        System.out.println(names);
        System.out.println(String.format("Ilość kobiet w tabeli: %d. Ilość mężczyzn: %d", womenNamesCount, menNamesCount));
    }
}