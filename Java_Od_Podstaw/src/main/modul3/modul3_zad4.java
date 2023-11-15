import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Map<String, String> citiesAndCapitals = Map.of("Poland", "Warsaw", "Croatia",
                "Zagreb", "Finland", "Helsinki","Greece", "Athens", "Italy", "Rome");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto");
        String userInput = scanner.nextLine();
        String output = citiesAndCapitals.get(userInput)!=null ? citiesAndCapitals.get(userInput) : "Podane miasto nie istanieje";
        System.out.println(output);

    }
}