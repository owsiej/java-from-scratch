package main.modul5.cw1_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/modul5/cw1/quiz.txt");
        List<String> lines = Files.readAllLines(path);
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for (String line : lines) {
            String[] questions = line.split(";");
            int correctAnswer = Integer.parseInt(questions[questions.length - 1]);
            System.out.println(questions[0]);
            for (int i = 1; i < questions.length - 1; i++) {
                System.out.println(i + "." + questions[i]);
            }
            System.out.println("Ktorą odpowiedź wybierasz? ");
            int userAnswer = Integer.parseInt(scanner.nextLine());
            System.out.println(userAnswer);
            if (correctAnswer == userAnswer) {
                score++;
                System.out.println("DOBRA ODPOWIEDŹ");
            } else {
                System.out.println("BŁĘDNA ODPOWIEDŹ");
                System.out.println("Prawidłową odpowiedzią była odpowiedź: " + correctAnswer + " - " + questions[correctAnswer]);
            }
        }
        System.out.println("Twój wynik to " + score);
    }
}
