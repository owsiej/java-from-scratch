package main.modul6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*
         functional programming - niemutowalny styl programowania, czyli wykonywanie operacje nie zmieniaja statusu obiektu,
                          zmienia style programowania z imperatywnego(mowimy co ma zrobić i jak ma zrobić) na styl
                          deklaratywny czyli tylko co ma zrobic
         stream - źródło obiektu, zapewnia przepływ danych danego obiektu
             * wyróżnia się 2 rodzaje operacji na steramach:
                 - intermediate operarations - filter, map, sort - robi logike na stream i zwraca kolejny stream
                 - terminal operations - collect, forEach, reduce, min, max, count - zbiera informacje i zwraca ją
         Powyższe metody z stream oczekując implementacji różnych intefejksów funkcyjnych.
         Metodę każdego z tych interfejsów możemy napisać, tworzą klase implementującą ten interfejs i dodając swoją
         logikę do tej metody.

         */

        List<User> users = prepareData();

        boolean anyMatchJaVa = users.stream()
                .anyMatch(user -> user.skills().contains("Golang"));

        boolean noneMatchGolang = users.stream()
                .noneMatch(user -> user.skills().contains("Golang"));

        boolean allMatchJava = users.stream()
                .allMatch(user -> user.age() >= 18);

        Optional<User> first = users.stream()
                .filter(user -> user.age() > 25)
                .findFirst();

        Optional<User> any = users.stream()
                .filter(user -> user.age() > 25)
                .findAny();

        int asInt = IntStream.range(0, 100)
                .findFirst().getAsInt();
        System.out.println(asInt);

        int asInt2 = IntStream.range(0, 100)
                .parallel()
                .findAny().getAsInt();
        System.out.println(asInt2);

        int[] numbers = new int[]{1, 5, 10, 17, 192};
        OptionalInt max = Arrays.stream(numbers)
                .max();

        OptionalInt min = IntStream.of(1, 5, 77, 99, 123)
                .min();

//      jest tez DoubleStream oraz LongStream
        IntStream
                .rangeClosed(0, 10)
                .forEach(System.out::println);


        List<String> names = List.of("Kamil", "Mariusz", "Dominik");
        List<String> names2 = List.of("Karol", "Rafał");

        Stream.concat(names.stream(), names2.stream())
                .filter(name -> name.startsWith("K"))
                .forEach(System.out::println);

        Map<Integer, List<String>> collect1 = users.stream()
                .map(User::name)
                .collect(Collectors.groupingBy(String::length));

        Map<Boolean, List<User>> collect2 = users.stream()
                .collect(Collectors.partitioningBy(User::isActive));

        long numberOfElements = users.stream()
                .count();


        Integer sumOfAge = users.stream()
                .collect(Collectors.summingInt(User::age));

        Double averageAge = users.stream()
                .collect(Collectors.averagingInt(User::age));

        Optional<Integer> maxAge = users.stream()
                .map(User::age)
                .max(Comparator.naturalOrder());

        Optional<Integer> minAge = users.stream()
                .map(User::age)
                .min(Comparator.naturalOrder());

        IntSummaryStatistics summary = users.stream()
                .collect(Collectors.summarizingInt(User::age));

        String collect = users.stream()
//                .filter(user -> !user.name().endsWith("a"))
//                .sorted(Comparator.comparing(User::name))
//                .limit(2)
//                .skip(1)
//                .takeWhile(user -> user.age() < 35)
//                .dropWhile(user -> user.age() < 35)
//                .forEach(user -> System.out.println(user.name() + ", " + user.age()));
//                .toList();
//                .map(user -> user.name() + ", " + user.age())
                .map(User::skills)
                .flatMap(Collection::stream)
//                .distinct()
//                .collect(Collectors.toSet());
                .collect(Collectors.joining(", "));


        Country country = new Country("Poland", "Warsaw");
        Country country2 = new Country("Germany", "Berlin");
        Country country3 = new Country("France", "Paris");
        Country country4 = new Country("Poland", "Cracow");

        List<Country> countries = List.of(country, country2, country3, country4);
        Map<String, String> countriesAndCapitals = countries.stream()
                .collect(Collectors.toMap(Country::name, Country::capital, (oldValue, newValue) -> oldValue));

    }

    private static List<User> prepareData() {

        List<User> users = new ArrayList<>();
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

