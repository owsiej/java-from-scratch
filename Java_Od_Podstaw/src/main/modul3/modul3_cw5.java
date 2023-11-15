import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj cenę produktu");
        int price = scanner.nextInt();

        System.out.println("Podaj zniżkę");
        int discount = scanner.nextInt();

        System.out.println((double)price*(100-discount)/100);

    }
} 