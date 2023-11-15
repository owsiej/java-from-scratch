package main.modul5.cw4_5;

import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(2023, 9, 30);
//        System.out.println(date.getMonth());
//        System.out.println(date.getYear());
//        System.out.println(date.getDayOfYear());
//        System.out.println(date);

//        Instant now = Instant.now();
//        System.out.println(now);
//        LocalDateTime warsaw = LocalDateTime.ofInstant(now, ZoneId.of("Europe/Warsaw"));
//        LocalDateTime newYork = LocalDateTime.ofInstant(now, ZoneId.of("America/New_York"));
//        System.out.println(warsaw);
//        System.out.println(newYork);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj swoją date urodzin.");
//        String[] userBirthday = scanner.nextLine().split("-");
//        LocalDate now = LocalDate.now();
//        LocalDate birthday = LocalDate.of(Integer.parseInt(userBirthday[2]), Integer.parseInt(userBirthday[1]), Integer.parseInt(userBirthday[0]));
//
//        Period period = Period.between(birthday, now);
//        System.out.println(period.getYears());
//        System.out.println(period.getMonths());
//        System.out.println(period.getDays());
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        Instant start = Instant.now();
        for (int i = 0; i < 100000000; i++) {
            int number = random.nextInt(1, 100000000);
            numbers.add(number);
        }
        Instant end = Instant.now();

        long seconds = Duration.between(start, end).toMillis();
        System.out.println(seconds);
    }
}
