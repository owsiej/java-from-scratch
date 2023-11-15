package pl_podstawy.wprowadzenie;

import java.util.ArrayList;
import java.util.List;

public class Generyki {
    public static void main(String[] args) {

        System.out.println(sumOfNumbersList(List.of(1,2,3,4,5)));

        ArrayList<Integer> lista1 = new ArrayList<>(List.of(1,2,3));
        duplicateList(lista1);
        System.out.println(lista1);
        MyCustomList<Long> list = new MyCustomList<>();
        list.addElement(50L);
        list.addElement(312L);
        System.out.println(list.get(0));
        System.out.println(list);

        MyCustomList<Integer> list2 = new MyCustomList<Integer>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(7));
        System.out.println(list2.get(0));
        System.out.println(list2);
    }
    static <X> X doubleValue(X value){
        return value;
    }
    static <X extends List> void duplicateList (X list) {
        list.addAll(list);
    }

//  <? - extends class> - akceptuje kazda zmienna która dziedziczy klase "class"
    static double sumOfNumbersList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number: list){
            sum+=number.doubleValue();
        }
        return sum;
    }

    //  <? - super class> - akceptuje kazda klase która jest podklasą "class"
    static void addCoupleOfValues(List<? super Number> list) {
        list.add(1);
        list.add(1.0f);
        list.add(1L);
        list.add(1.0d);

    }

}
// - jeżeli chcemy ograniczyć typ danych w generetykach możemy dorzucić dziedziczenie przez dany typ jakieś klasy
//   i wtedy typy danych możliwe do zaimplemetowania będą ograniczone przez klase matkę
class MyCustomList<T extends Number> {
        ArrayList<T> lista = new ArrayList<>();

        public void addElement(T element) {
            lista.add(element);
        }

        public void removeElement(T element) {
            lista.remove(element);
        }

        public String toString() {
            return lista.toString();
    }
        public T get(int index) {
            return lista.get(index);
        }
}



