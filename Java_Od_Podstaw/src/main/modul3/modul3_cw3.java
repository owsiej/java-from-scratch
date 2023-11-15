import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę 1 ");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj liczbę 2");
        int liczba2 = scanner.nextInt();
        System.out.println("Podaj operacje");
        String operacja = scanner.next();

        switch (operacja) {
            case "dodawanie" -> System.out.println(liczba1+liczba2);
            case "odejmowanie" -> System.out.println(liczba1-liczba2);
            case "mnożenie" -> System.out.println(liczba1*liczba2);
            case "dzielenie" -> System.out.println(liczba1/liczba2);
        }
    }
}
