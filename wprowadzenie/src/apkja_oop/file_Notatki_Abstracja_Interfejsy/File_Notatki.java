package apkja_oop.file_Notatki_Abstracja_Interfejsy;

/*
 Wszystkie metody zaimplementowane w interfesie są od razu abstrakcyjne i publiczne(mogą być również domyśle lub statyczne)
 wszystkie argumenty są publiczne, finalne i statyczne.
 Jedna klasa może implementować wiele interfejsów

 Wyróżniamy również interfejsy funkcyjne ktore, które posiadają jedna metodę abstrakcyjną i mogą być zaimplementowane
 jak klasa anonimowa albo poprzez wyrazenie funkcji lambda
 Przykładowe interfejsy funkcyjne:
  - Function - przyjmuje obiekt typu T i zwraca obiekt typu R
  - Predicate - przyjmuje obiekt typu T i zwraca boolean, w stream wystepuje w metodzie filter
  - Supplier - nic nie przyjmuje ale zwraca obiekt danego typu
  - Consumer - przyjmuje obiekt danego typu ale nic nie zwraca
  - UnaryOperation - rozszerza inferfejs Function tak, że obiekt przyjmowany i zwracany musi być tego samego typu
  - Comparator - przyjmuje dwa obiekty i zwraca wynik ich porownania w postaci liczby int
  - Runnable - nic nie przyjmuje i nic nie zwraca
 */

public interface File_Notatki {
    String getName();
    int getSize();
    Filetype getType();

//  definiowanie domyslnych metod interfejsu
//    - służy głównie dodawaniu nowych metod do interfejsuu po czasie, tak aby nie było ich trzeba implemetować
//      we wszystkich implementacjach interfejsu
//    - w przypadkum, gdy klasa implementuje 2 interfejsy, gdzie każdy z nich posiada metode domyślą o tej samej nazwie,
//      koniecznym będzie zaimplementowanie takiej metody w klasie implementującej inferfejs, ponieważ java nie wie
//      z której metody ma skorzystać
    default int getVersion() {
        return 1;
    }
//  metody statyczne - również nie muszą być definiowane w klasach implementujących dany interfejs
    static String getSth() {
        return "cos tam zwracam";
    }
    static String getSth (String costam) {
        return "cos tam zwaracam razem z"+costam;
    }


}
