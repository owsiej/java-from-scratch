import java.util.*;

class Scratch {
    public static void main(String[] args) {
        List<String> names1 = List.of("Paweł", "Jacek", "Michał", "Agata", "Marzena", "Kuba", "Piotr", "Agnieszka", "Łukasz", "Wojtek");
        List<String> names2 = List.of("Paweł", "Arkadiusz", "Michał", "Agata", "Sylwia", "Kuba", "Damian", "Agnieszka", "Łukasz", "Krzysiek");

        for (String name1: names1) {
            for (String name2: names2) {
                if (name2.equals(name1)){
                    System.out.println(name2);
                    break;
                }
            }
        }
    }
}