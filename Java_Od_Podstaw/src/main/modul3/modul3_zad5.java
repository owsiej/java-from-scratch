import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        List<String> names = List.of("Paweł", "Jacek", "Michał", "Agata", "Marzena", "Kuba", "Paweł", "Agnieszka", "Łukasz", "Wojtek");
        ArrayList<Integer> foundIndexes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String userInput = scanner.nextLine();

        for (int i =0;i<names.size(); i++) {
            if(names.get(i).equals(userInput)) {
                foundIndexes.add(i);
            }
        }
        String output = foundIndexes.size()>0 ? foundIndexes.toString() : "Nie znaleziono imiona";
        System.out.println(output);
    }
}