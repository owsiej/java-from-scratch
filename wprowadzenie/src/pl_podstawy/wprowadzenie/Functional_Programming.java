package pl_podstawy.wprowadzenie;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Functional_Programming {

    public static void main(String[] args) {

        List<String> list = List.of("Apple", "Bat", "Cat", "Dog", "Ananas");
        List<Integer> list2 = List.of(1, 2, 3, 5, 6, 7, 9, 31, 2, 65, 23, 3);
      /*  printWithFpFiltering(list);
        printWithFpFilteringNumbers(list2);
        System.out.println(getSum(list2));
               */
        System.out.println(printSquareOf10FirstInts());
    }

    private static void printBasic(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    /*wyrażenie lambda - (parametry -> działanie/metoda/funkcja) - może mieć rozbudowaną logikę, wtedy umieszczamy ją
                         pomiędzy nawiasami {} i kończymy returnem;
     stream - źródło obiektu, zapewnia przepływ danych danego obiektu
             * wyróżnia się 2 rodzaje operacji na steramach:
                 - intermediate operarations - filter, map, sort - robi logike na stream i zwraca kolejny stream
                 - terminal operations - collect, forEach, reduce, min, max - zbiera informacje i zwraca ją
     functional programming - niemutowalny styl programowania, czyli wykonywanie operacje nie zmieniaja statusu obiektu,
                              zmienia style programowania z imperatywnego(mowimy co ma zrobić i jak ma zrobić) na styl
                              deklaratywny czyli tylko co ma zrobic

     */
    private static void printWithFp(List<String> list) {
//        list.stream().map(e->e.toLowerCase()).forEach(element -> System.out.println(element));
        list.stream().map(e -> e.length()).forEach(System.out::println);
    }

    private static void printWithFpFiltering(List<String> list) {
        list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
    }

    private static void printWithFpFilteringNumbers(List<Integer> list) {
        list.stream().filter(element -> element % 2 != 0).forEach(System.out::println);
    }

    private static int getSum(List<Integer> lista) {
        int sum = lista.stream().filter(element -> element % 2 != 0).reduce(0, (number1, number2) -> {
            System.out.println(number1 + " " + number2);
            return number1 + number2;
        });
        return sum;
    }

    private static <T> void sortList(List<T> lista) {
        lista.stream().sorted().forEach(new LambdaBehindScenesForEachPrint());
    }

    private static void distinctElOfList(List<Integer> lista) {
        lista.stream().distinct().forEach(System.out::println);
    }

    private static void mapElsOfList(List<Integer> lista) {
        lista.stream().map(new LambdaBehindScenesMap()).forEach(System.out::println);
    }

    private static List<Integer> printSquareOf10FirstInts() {
        return IntStream.range(1, 10).map(e -> e * e).boxed().collect(Collectors.toList());

    }

    /* klasa Optional - zwraca wartość z glownymi metodami isPresent - do sprawdzenia czy wartość istnieje i nie jest null
                        oraz ifPresent - robi cos gdy wartosc istnieje,
                        - orElse("cos tam sie wykonuje") - wykonuje jakaś logike i zwraca pewną wartość jeżeli Optional
                          jest nullem, nawet kiedy Optional nie jest nullem to ta logika się wykona, aby tego uniknąć
                          możemy zastosować metodą orElseGet(), która wykona logikę tylko w przypadku Optional==null
                        - wartość z Optional pobieramy za pomocą get()

     */
    private static int findMax(List<Integer> lista) {
        int maximum = lista.stream().max(Integer::compare).get();
        return maximum;
    }

    private static List<Integer> getList(List<Integer> lista) {
//        return lista.stream().filter(e->e%2!=0).collect(Collectors.toList());
        return lista.stream().filter(new LambdaBehindScenesFilter()).collect(Collectors.toList());

    }

}

/*
    interfejs Predicate wykorzystywany jest przez funkcje filter w lambdzie aby zwrocic wartosc boolean dla danego
    argumentu, czyli mozemy dodac logike, która będzie "testowała" argumenty w metodzie filter dla lambdy, czyli
    w przypadku kiedy mamy kod postaci .filter(e -> e%2!=0) to kompilator Java implementuje metodę test z interfejsu
    Predicate i wrzuca tam logike z funkcji lambda
 */
class LambdaBehindScenesFilter implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return number%2!=0;
    }
}

/*
    podobnie jak w przypadku filter, w metodzie forEach wykorzystywany jest interfejs Consumer z metodą accept. Jako,
    że metoda nic nie zwraca tylko wykonuje jakąś akcje na elemencie, to możemy tą akcje zaimplementować w metodzie accept.
 */
class LambdaBehindScenesForEachPrint<T> implements Consumer<T> {


    @Override
    public void accept(T t) {
        System.out.println(t);
    }
}
/*
    map wykorzystuje interfejs Function, który przyjmuje input T a oddaje output R
 */
class LambdaBehindScenesMap implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }
}