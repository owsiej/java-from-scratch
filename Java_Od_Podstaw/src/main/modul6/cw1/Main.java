package main.modul6.cw1;

import main.modul6.cw1.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users = prepareData();

//         1. Wyświetl imiona użytkowników, którzy znają Jave
//        users.stream()
//                .filter(user -> user.skills().contains("Java"))
//                .map(User::name)
//                .forEach(System.out::println);
//
//        2. Wyświetl imiona i wiek niekatywnych użytkowników
//        users.stream()
//                .filter(user -> !user.isActive())
//                .map(user -> user.name() + ", " + user.age())
//                .forEach(System.out::println);

//        3. Znajdź użytkownikow, którzy znają co najmniej 3 języki
//           oraz wyświetl imiona tych użytkowników oraz ich języki
//        users.stream()
//                .filter(user -> user.skills().size() >= 3)
//                .map(user -> user.name() + ", " + String.join(", ", user.skills()))
//                .forEach(System.out::println);

//        4. Znajdź użytkownika, która zna najwięcej technologii oraz
//           wyświetl jego imie oraz technologie
//        List<String> userWithMostTechs = users.stream()
//                .sorted(Comparator.comparing(user -> user.skills().size()))
//                .map(user -> user.name() + " : " + String.join(", ", user.skills()))
//                .skip(users.size() - 1)
//                .toList();
//        Optional<User> max = users.stream()
//                .max(Comparator.comparing(user -> user.skills().size()));
//        System.out.println(max.get().name() + ": " + String.join(", ", max.get().skills()));

//        5. Wyświetl średni wiek aktywnych użytkowników
//        Double averageAge = users.stream()
//                .filter(User::isActive)
//                .collect(Collectors.averagingInt(User::age));
//        System.out.println(averageAge);

//        6. Wyświetl średni wiek nieaktywnych użytkowników
//        Double averageAge = users.stream()
//                .filter(user -> !user.isActive())
//                .collect(Collectors.averagingInt(User::age));
//        System.out.println(averageAge);

//        7. Wyświetl ile średnio technolgii zna użytkownik
//        OptionalDouble averageTechs = users.stream()
//                .mapToInt(user -> user.skills().size())
//                .average();
//        System.out.println(Math.round(averageTechs.getAsDouble()));

//        8. Podziel użytkowników na tych, którzy znają Jace oraz na tych, którzy jej nie znają
//           Wyświetl imiona oraz technologie użytkowników z obu grup.
//        Map<Boolean, List<User>> java = users.stream()
//                .collect(Collectors.groupingBy(user -> user.skills().contains("Java")));
//        java.get(false).stream()
//                .map(user -> user.name() + ": " + user.skills())
//                .forEach(System.out::println);
//        java.get(true).stream()
//                .map(user -> user.name() + ": " + user.skills())
//                .forEach(System.out::println);

//        9. Sprawdź czy wszyscu użytkownicy mają więcej niż 18 lat
//        boolean b = users.stream()
//                .allMatch(user -> user.age() > 18);
//        System.out.println(b);

//        10. Sprawdź czy istnieje użytkownik który ma wiecej niż 40 lat
//        boolean isOver40 = users.stream()
//                .anyMatch(user -> user.age() >= 40);
//        System.out.println(isOver40);

//        11. Znajdź najstarszego użytkownika, która zna Jave
//        Optional<User> oldestUserWithJava = users.stream()
//                .filter(user -> user.skills().contains("Java"))
//                .max(Comparator.comparing(User::age));
//        System.out.println(oldestUserWithJava.get());

//        12. Znajdź użytkowników którycj nazwy zaczynają się na litere C
//        users.stream()
//                .filter(user -> {
//                    boolean b = user.skills().stream().anyMatch(item -> item.startsWith("C"));
//                    return b;
//                })
//                .forEach(System.out::println);

//        13. Utwórz mapę, która jako klucz otrzyma imie użytkownika a jako wartość
//            liczbę technologii, które zna użytkownik
//        Map<String, Integer> collectUsersWithAge = users.stream()
//                .collect(Collectors.toMap(User::name, user -> user.skills().size()));
//        System.out.println(collectUsersWithAge);

//        14. Wybierz z podanej listy słowa które są palindromami
//        List<String> words = List.of("kajak", "oko", "komputer", "ala", "zakaz", "java", "programowanie");
//        words.stream()
//                .filter(word -> {
//                    StringBuilder wordBuilder = new StringBuilder(word);
//                    return word.contentEquals(wordBuilder.reverse());
//                })
//                .forEach(System.out::println);

//        15. Wyświetl wszystkie słowa z podanej listy, oddziel je przecinkami
//            oraz zadbaj o to, żeby zamienić wszystkie litery na duże
//        List<String> words = List.of("kajak", "oko", "komputer", "ala", "zakaz", "java", "programowanie");
//        String collect = words.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.joining(", "));
//        System.out.println(collect);

//        16. Mając dwie listy liczb całkowitych, znajdź najmniejszą liczbę parzystą

//        List<Integer> list1 = List.of(62, 55, 120, 17, 7, 11, 2);
//        List<Integer> list2 = List.of(42, 27, 35, 98);
//
//        Optional<Integer> min = Stream.concat(list1.stream(), list2.stream())
//                .filter(number -> number % 2 == 0)
//                .min(Comparator.naturalOrder());
//        System.out.println(min.get());
    }

    private static List<main.modul6.cw1.User> prepareData() {
        List<main.modul6.cw1.User> users = new ArrayList<>();
        users.add(new User("Kamil", 35, List.of("Java", "Python", "JavaScript"), true));
        users.add(new User("Mariusz", 30, List.of("Java", "C++", "C#"), true));
        users.add(new User("Dominik", 20, List.of("Java", "Dart", "Python"), false));
        users.add(new User("Rafał", 40, List.of("C", "C++", "C#"), true));
        users.add(new User("Paulina", 31, List.of("Python", "JavaScript", "Rust"), true));
        users.add(new User("Kasia", 30, List.of("PHP", "Haskell"), false));
        users.add(new User("Asia", 25, List.of("Java", "Scala", "Kotlin", "Haskell", "Clojure"), true));

        return users;
    }
}
