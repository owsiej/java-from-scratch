import java.util.HashMap;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> letterCounter = new HashMap<>();
        System.out.println("Podaj dowolny tekst");
        String inputText = scanner.nextLine();

        for (int i = 0; i < inputText.length(); i++) {
            Character currentChar = inputText.charAt(i);
            if (!Character.isLetter(currentChar)) {
                continue;
            }
            if (!letterCounter.containsKey(currentChar)) {
                letterCounter.put(currentChar, 1);
            } else {
                int value = letterCounter.get(currentChar);
                value++;
                letterCounter.put(currentChar, value);
            }
        }
        System.out.println(letterCounter);
    }
}