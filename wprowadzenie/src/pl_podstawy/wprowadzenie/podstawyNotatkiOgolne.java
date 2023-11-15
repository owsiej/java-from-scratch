package pl_podstawy.wprowadzenie;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class podstawyNotatkiOgolne {
// String[] args - przekazywanie argumentów z zewnątrz do funkcji
    public static void main(String[] args){

//  rzutowanie zmiennych
        int a = 5, b = 2;
        System.out.println((double) 1 / 5);

//  preinkrementacja (najpierw dodaje 1 a poźniej wyświetla wartość
        System.out.println(++a);

//  skrocone wyrażenie warunkowe
//      schemat -> wyrażenie - ? - co ma się wydarzyć jeżeli jest prawdziwe - : - co jeżeli fałszywe
        String czyParzysta = a % 2 == 0 ? "parzysta" : "nieparzysta";

//  wyrażenie switch - określenie co ma się wydarzyć, w zależności od wartości zmiennej:
        int c = 5;
        switch (c) {
            case 1 -> System.out.println("jakaś funkcja");
            case 5 -> System.out.println("jakaś funkcja nr 2");
        }

//  deklarowanie tablic jednowymiarowych
//        - muszę mieć z góry zadeklarowaną wielkość, której nie można zmieniać;
//        schemat - rodzaj zmiennej - znak tablicy [] - nazwa zmiennej - inicjacja nowej tablicy poprzez słowo new i
//                  określenie ilości elementów w tablicy poprzez [3]
        int[] tablica = new int[3];
        int[] tablica2 = {1, 2, 3};
        tablica[0] = 1;
        System.out.println(tablica2.length);

//  deklarowanie tablic wielowymiarowych
//        - cos na wzor macierzy, deklarujemy ilość wieszy poźniej kolumn
        int[][] tablica3 = new int[3][4];
        int[][] tablica4 = {
                {1, 2, 3},
                {4, 5, 6},
                {8, 9, 10},
                {11, 12, 13}
        };
        System.out.println("tutaj");
        System.out.println(tablica4[0][2]);

//  działania na klasie Array:
//      - aby ustawić właściwości sortowania, zależy zaimplementować interfejs Comparable i tam ustawić parametry.

        int[] tab = {43, 4, 23, 4, 234};
        Arrays.sort(tab);
        System.out.println(tab[0]);

//  pętle for
//        schemat - punkt startowych, punkt końcowy, warunek
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//  pętla wzmocniona - for each
//        schemat - zmienna z typem - : - nazwa iteratora(lista,słownik itp) - działanie
        for (int i : tablica
        ) {
            System.out.println(i);
        }

//  pętla do while
//        - od zwykłej pętli while różni się tym, że warunek kończący znajduje się na końcu pętli
        int i = 0;
        do {
            i++;
        } while (i < 5);

//  wyrzucanie wyjątków
//        - wyjątki dzielimy na kontrolowane lub niekontrolowane,
//        - wyjątki kontrolowane będziemy musieli obsłużyć w programie(nie dziedziczą one po klasie RuntimeException)
//          * w tej sytuacji możemy albo owinąć metodą wyrzucająca błąd blokiem try-catch albo w metodzie dopisać
//            słowo kluczowe throws i nazwa wyjątku, wtedy potrzebny będzie blok try-catch w miejscu wywołania metody
        int r = 10;
        if (r == 9) {
            throw new RuntimeException("Wyrzucam wyjątek");
        }
        try {
            if (r == 8) {
                System.out.println("coś tam robie");
            }
        } catch (RuntimeException e) {
            System.out.println("Wyskoczył wyjątek" + e);
        }

//  sprawdzenie wersji javy z pomocą klasy system

        System.out.println(System.getProperty("java.version"));

//  iterowanie przez Stringi
        String input1 = "jakiś_wyraz";

        String result = "";
        for (int d = input1.length() - 1; d >= 0; d--) {
            result += input1.charAt(d);
        }
        System.out.println(result);

//  porównywanie stringów
        String imie = "Michał";
        String imie2 = new String("Michał");

        System.out.println(imie == imie2); // zwroci false, z powodu różniego położenia w pamięci obu zmiennych
        System.out.println(imie.equals(imie2)); // zwroci true

//  split(" ") - zamiana String na Array po whitespaces
        String text2="jestem sobie tekstem i wkurwiam ludzi.";

        String[] arr = text2.split(" ");


//  slice stringa , nawiasach podajem indexy od kiedy do kiedy mamy złapać stringa
        String newString = text2.substring(4,10);
        System.out.println();
        System.out.println(newString);

//  łączenie stringów - metoda concat
        String text = "lalalal";
        text.concat(text2);
        String.join(",", "A", "B");

//  usuwanie whitespaces
        String text3 ="    dasdasd    ";
        text3.trim();

//  StringBuilder - pozwala przeprowadzać różnie operacja na stringach, zmienia string na obiekt mutowalny
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        stringBuilder.append("cokolwiek");
        stringBuilder.replace(0,4,"czymś zastępujemy");

//  StringBuffer - działa tak samo jako StringBuilder ale jest wielowątkowy czyli thread - safe
        StringBuffer stringBuffer = new StringBuffer();


//  klasa Character do sprawdzania no rodzajów znaków; do oznaczenia znaków używa się pojedyńczego apostrofu - ''
        char[] litery = {'d', '2'};
        for (char ch : litery) {
            System.out.println(Character.isDigit(ch));
            System.out.println(Character.isLetter(ch));
            System.out.println(Character.isWhitespace(ch));
        }

//  printf - print z formatowaniem:
/*      - dodanie liczby do formatu oznacza wcięcie z lewej strony, np. %15s
        - '-' justuje do lewej, czyli %-15s da wcięcie z prawej strony
        - '0' wypełnia całość zerami
        - %s, %S - do stringów kolejno lowercase i uppercase
        - %d, - do intów
        - %c - do char
        - %b - do boolean
        - %f - do float
        - %n - newline
        - %tT - formatowanie daty
*/
        String name = "Cameron";
        String site = "TechTarget";
        int above = -31231;
        int below = 42342;

        System.out.printf("I like the stuff %s writes on %S. %n", name, site);
        System.out.printf("I like the stuff %15s %n", name, site);
        System.out.printf("%015d lol", above);
        System.out.println();

//  klasa Scanner jako przechodzenie przez stringa
//        - do scannera dodajemy zmienną String i scanner dzieli go na tokeny używać Delimitera (domyśle whitespace)
//        -
        String txt = "jestem,sobie,tekstem,i,wkurwiam,ludzi.";

        Scanner scanner = new Scanner(txt).useDelimiter(",");
        while (scanner.hasNext()) {
            String word = scanner.next();
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
        }
//  Daty:
//        - aby obliczyć różnicę w czasie dla klas LocalDate używamy klasy Period a dla klasy LocalDateTime klasy Duration
//        - klasa Instant służy do generowania czasu dla komputera czyli w sekundach od 1.01.1970r
//        - date możemy modyfikować za pomocą metody with() na klasie LocalDate/Time wykorzystując TemporalAdjuster
//        - formatowanie daty - metoda format() klasy LocalDate/Time, mozna tworzyc wlasny formatter za pomoca
//          klasy DateTimeFormatter
//        - parsowanie daty za pomoca metody parse() czyli tworzenie daty z stringa na podstawie podanego patternu

        LocalDate date = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();
        Instant date3 = Instant.now();
    }
//    varargs - przyjmowanie przez metody różnej ilości argumentów poprzez dodanie ... ->, takie argumenty przyjmowane
//              są jako tablica, przez którą możemy iterować
//              * taki argument musi być zdefiniowany jakos ostatni w metodzie;
    public static void varArgs(String... items) {
        for (String item : items) {
            System.out.println(item);
        }
    }
}