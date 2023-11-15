package pl_podstawy.wprowadzenie_oop;

// public - modyfikator dostępu, argumenty można modyfikować z poziomu każdej klasy z tego pakietu
//        - w danej klasie tylko klasa głowna (main) może być ustawiona jako public
// package private - domyślny modyfikator, pojawia się kiedy nie zadeklarujemy żadnego innego modyfikatora,
//                  dane pole jest dostępne w obrębie danego pakietu
// private - modyfikator dostępu, metoda widoczna tylko z poziomu klasy, w ktorej jest zaimplemetowana
//         * można używać modyfikatora private na konstruktorze, używany jest on w klasach typu singleton lub
//           klasach użytkowych czyli klasy z jedną instancją, która posiada zmienną statyczną przechowującą
//           tą instację oraz metodą wywołującą ten konstruktor
// protected - modyfikator dostępu, widocze w całym pakiecie i klas dziedziczących;
// enkapsulacja/hermetyzacja - ukrywanie dostepu do skladowych klasy (modyfikator private/protected)
// final - ustala dany argument jako końcowy, którego nie można już zmienić, dodawany przed typem zmiennej
//        * final class ... - ustanawia finalną klasę, czyli taką klasę, której nie można już zmienić, ani dziedziczyć
//        * final int ... - ustanawia zmienna, której nie można już zmienić, zapisujemy ją dużymi literami, np. VARIABLE_NAME
//        * final void ...() - finalna metoda, ktore nie moze byc nadpisana
// static - uzyskujemy dostep do czegos z klasy bez koniecznosci tworzenia instacji tej klasy
//          * static variable - jest jedyna kopia i wspoldzielona przez wszystkie instacje tej klasy
//                            - mogą być używane przez statyczne i niestatyczne metody
//          * static method - może bezpośrednio wywoływać inne statyczne metody;
//                          - ma bespośredni dostęp tylko do statycznych danych
//          * static class - może być zaimplemetowana tylko jak nested class
//                         - zagniezdzona klasa statyczna nie pozwala używać niestatycznych wlasciwosci z wyższej klasy
// utility classes - klasy zawierające zmienne/metody static, czyli wykonując jakieś działania bez konieczności tworzenia
//                  instancji ich klasy
import java.util.Objects;

public class oopNotatki {
    public static void main(String[] args) {
        System.out.println(przyklady.dodaj(5,6));

//  garnek jest zmienna referencyjna, czyli odwoluje sie do adresu a nie do konkretnej wartości (zmiennej prymitywnej)
        przyklady garnek = new przyklady(5, 10, "srebny");
        przyklady garnek2 = new przyklady(10, 15, "srebny");

//  sprawdzenie czy dany obiekt jest instacja danej klasy
//  - dodanie lolek na końcu tworzy pattern variable, czyli jeżeli garnek jest instancja klasy przyklady to od razu zamieniamy
//    (robimy type casting) garnek na instancje klasy przyklady pod zmienna lolek
//        System.out.println(garnek instanceof przyklady lolek);

//  super klasa Object - każda tworzona klasa dziedziczy z klasy Object
        Object obiekt = new Object();
        System.out.println(garnek.getClass()); // getClass - zwraca nazwę klasy

//  - metoda służąca do porównywania obiektów, porównuje identyczność obiektów, czyli czy obie zmienne wskazują
//    na ten sam obiektu w pamięci
//  - można ją nadpisać w każdej klasie i ustawić swoje warunki porównania
        System.out.println(garnek.equals(garnek2));

//  tworzenie instacji klasy zagnieźdzonej
        A zew = new A();
        A.B wew = zew.new B();

//  implementacja klasy anonimowej, klasa JButton

        ZachowaniePoWcisnieciu z = new ZachowaniePoWcisnieciu() {
            @Override
            public void akcja() {
                System.out.println("Jestem z klasy anonimowej. z");
            }
        };

//  wyrażenie lambda(wykorzystanie ->), () - służą do przesłania argumentów do funkcji z interfejsu czyli akcja(),
//                                           po -> mamy to co ma się wywołać w funkcji
//  - aby wywołać lambdę musisz mieć tylko jedną metodą na jeden interfejs(nielicząc metod typu default),
//    czyli z wyrazenia korzystamy kiedy mamy doczynienia z interfejsem funkcyjnym
//    * przy wyrazeniach lambda, zmienna podawa jako argument musi byc finalna
        ZachowaniePoWcisnieciu w = () -> {
            System.out.println("Jestem z klasy anonimowej w");
        };
        Przycisk p = new Przycisk();
        p.dodajAkcje(z);
        p.dodajAkcje(w);
    }
    }
    class przyklady{
    //    dodanie public tutaj sprawia ze mozna modyfikowac ponizsze argumenty nawet z poziomu innego pakietu
//    public int srednica;
    int srednica;
    int wysokosc;
    String kolor;

//  tworzenie domyslnego konstruktora, który za wartości domyślne przyjmuje 0, null, false
//    - tworzy się on samoczynnie
    public przyklady() {

    }
//  przeciązenie konstruktorów - utworzenie kilku konstruktorow dla jednej klasy przyjmujących rożne argumenty
    public przyklady(int srednica, int wysokosc) {
        this.srednica = srednica;
        this.wysokosc = wysokosc;
    }

//  kolejny nowy konstruktor
    public przyklady(int srednica, int wysokosc, String kolor) {
        this.srednica = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;
    }

//  tworzenie metody - przed nazwą metody piszemy co ona ma zwrócić, tutaj np mamy String
    public String gotuj() {
        return "Gotowanie w trakcie";
    }

//  przeciązenie metody - dodanie drugi raz tej samej metody lecz z innymi wymaganymi argumentami;
    public String gotuj(boolean czyDodalismySol) {
        if (czyDodalismySol) {
            return "Gotowanie z solą";
        } else {
            return "Gotowanie bez soli";
        }

    }

//  metoda nic niezwracajaca - void
    public void gotujBezInformacji() {
        System.out.println("nic nie zwracam");
    }

// tworzenie metody static
//    static - oznacza ze mamy dostep to tej metody/argumentu bez koniecznosci tworzenia instacji klasy
//     - czyli piszemy nazwa klasy w ktorej znajduje sie dana metoda - . - nazwa metody z argumentami
    static int dodaj(int a, int b) {
        return a+b;
    }

//   - nadpisanie metodu equals z klasy Object do porównania instancji klasy
//   - razem z metodą equals trzeba nadpisać metodę hashcode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;

//  rzutowanie obiektu - (przyklady) o, czyli przejscie drabinka niżej z Obiektu super klasy czyli klasy Object - o -
//                        na klasę niższą, czyli - (przyklady) - tak, aby mieć do niej dostęp
            przyklady przyklady = (przyklady) o;
            return Objects.equals(kolor, przyklady.kolor);
        }

        @Override
        public int hashCode() {
            return Objects.hash(srednica, wysokosc, kolor);
        }
    }

//  w klasach zagnieżdzonych klasa wewnętrzna ma dostęp do argumentów z klasy zewnętrznej ale klasa zewnętrzna nie ma
//  dostępu do argumentów klas wewnętrznych. Za to do klas samych w sobie dostęp jest dwukierunkowy
        class A {
        private int test;
            class B {
                int tmp;
                void cos() {
                    A obj = new A();
                    test=5;
                }
            }
            void cos2() {
//                tmp=2; nie dziala
                B obiekt = new B();
            }
        }

//  dla klasy anonimowej
    interface ZachowaniePoWcisnieciu {
        void akcja();
    }
    class Przycisk {
     void dodajAkcje(ZachowaniePoWcisnieciu z) {
         z.akcja();
     }
    }

