package pl_podstawy.wprowadzenie;

import java.util.*;

public class Kolekcje_Listy {
    public static void main(String[] args) {

//  tworzenie listy której nie można zmodyfikować - List.of - immutable list
//        - w listach nie mozesz przechowywac wartości prymitywnych;
//        - Autoboxing - zamiana prymitywow na wrapper klasy
        List<String> words = List.of("Apple", "Bat", "Cat");
        List values = List.of("1", '1', 1, 1.0); // w liscie bez zadeklarowanego typu danych mozesz przechowywac wszystkie referencyjne typy danych
        System.out.println(values);
        System.out.println(words.size());
        System.out.println(words.isEmpty());
        System.out.println(words.indexOf("Apple"));
        System.out.println(words.get(0));
        System.out.println(words.contains("Dog"));

//  tworzenie mutowalnej listy
//        * ArrayList posiada wewnątrz zwykłą Array, jeżeli dodaje/usuwamy coś z ArrayList w tle zostaje tworzona nowa Array
//        * dostęp do danych jest szybszy niż w LinkedList
//        * stosuje się do przechowywania i dostępu do danych
//        * od Vector różni się tym, że jest niezsynchronizowana, czyli więcej niż jeden wątek może działać w tym samym czasie.
        List<String> words2 =new ArrayList<String>(words);
        System.out.println(words2);
        System.out.println(words.hashCode());
        words2.add("Dog");
        System.out.println(words.hashCode());
        words2.add(2,"Elephant");
        words2.add("Dog");
        System.out.println(words.hashCode());


        Iterator<String> words2Interator = words2.iterator(); //iterowanie przez liste z wykorzystaniem iteratora
        while (words2Interator.hasNext()) {
            System.out.println(words2Interator.next());
            if (words2Interator.next().endsWith("at")) {
                words2Interator.remove(); //usuwanie elementow z listy za pomoca iteratora
            }
        }

        List<String> words22 =new ArrayList<String>(words);
        List<Integer> numbs = List.of(3,23,32,2,1,3,123,4,2,4);
        List<Integer> numbsAr = new ArrayList<>(numbs);
        words22.add("Ananas");
        Collections.sort(words22); //najpierw wielkie litery, pozniej male

//  interfejs Comparable - implementujemy go w klasie, jezeli chcemy ustawic stale sortowanie dla obiektow danej klasy
//            * nadpisujemy metode compareTo, ktora pozostaje niezmienna dla danej klasy
//  interfejs Comparator - robimy nową klase implementującą Comparator i w niej nadpisując metodę compare mozemy ustalic
//                         nowe warunki sortowania w zaleznosci od wybranego comparatora
//                       - instacje klasy nowego comparatora dodajemy jako argument do metody Collections.sort(lista, comparator)
//                         albo lista.sort(comparator)
        List<Student> students = List.of (new Student("Adam", 23), new Student("Wiesiek", 10), new Student("Radzio", 30), new Student("adas",50));
        ArrayList<Student> studentsAr = new ArrayList<>(students);
        Collections.sort(studentsAr);
        System.out.println(studentsAr);
        studentsAr.sort(new DescendingComparator());
        System.out.println(studentsAr);
        studentsAr.sort(new NameComparator());
        System.out.println(studentsAr);


        words2.addAll(2,words); //dodawanie listy do listy
        words2.set(6, "Fish"); //podmiana elementu na danej pozycji
        words2.remove(2);
        words2.remove("Fish"); //w przypadku usuwanie liczby Integer.valueOf(liczba)
        List<String> words3 = new ArrayList<>(Arrays.asList("bolek", "lolek"));
        words2.addAll(words);
        words3.addAll(words2);
        System.out.println(words3);

//  - LinkedList - przechowuje dane w pojemnikach z czego każdy pojemnik ma adres do następnego pojemnika
//        * dzięki temu operacje typu add/remove są w niej wykonywane znacznie szybciej niż w ArrayList, jednakże
//          przeszukiwanie LinkedList jest znacznie dłuższe niż w ArrayList.
//        * stosuje się w przypadku kiedy chcemy dane w liście zmieniać;
        List<String> llist = new LinkedList<>();

//  - Vector - struktura bardzo podobna do ArrayList
//        * jest zsynchronizowana, czyli tylko jeden wątek na raz może korzystać z metod, przez to jest wolniejasza bo reszta
//          wątków czeka w kolejne na skorzystanie z metod
        Vector<String> vec = new Vector<>();
    }

}
class DescendingComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getId(), s1.getId());
    }

}
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}
class Student implements Comparable<Student>{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.id, student.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}