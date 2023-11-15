package main.modul4.zadania;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj model samochodu");
        String make = scanner.nextLine();
        System.out.println("Podaj marke samochodu");
        String model = scanner.nextLine();
        System.out.println("Podaj rok produkcji");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj kolor samochodu");
        String color = scanner.nextLine();
        System.out.println("Podaj prędkość maksymalną");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj zasięg");
        int range = scanner.nextInt();
        scanner.nextLine();
        Car car = new Car(make, model, color, year, maxSpeed, range);
        System.out.println(car);

        while (true) {
            System.out.println("1. Jedź");
            System.out.println("2. Uzupełnij benzynę");
            System.out.println("3. Zakończ");
            int userInput = Integer.parseInt(scanner.nextLine());

            switch (userInput) {
                case 1 -> {
                    System.out.println("Podaj dystans do przejechania");
                    int distance = Integer.parseInt(scanner.nextLine());
                    car.drive(distance);
                    System.out.println(car.getMileage());
                    System.out.println(car.getRange());

                }
                case 2 -> {
                    car.addFuel();
                    System.out.println(car.getMileage());
                    System.out.println(car.getRange());
                }
                case 3 -> System.exit(0);
            }
        }
    }
}

class Car {
    private final String make;
    private final String model;
    private final int year;
    private final int maxSpeed;
    private final int maxRange;
    private String color;
    private int mileage;
    private int range;

    public Car(String make, String model, String color, int year, int maxspeed, int range) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.maxSpeed = maxspeed;
        this.range = range;
        this.maxRange = range;
    }

    public Car(String make, String model, String color, int maxspeed, int range) {
        this(make, model, color, 2023, maxspeed, range);
    }

    @Override
    public String toString() {
        return "Utworzyłeś następujący samochód:\n" +
                "Marka: " + make + '\n' +
                "Model: " + model + '\n' +
                "Rok produkcji: " + year + '\n' +
                "Kolor: " + color + '\n' +
                "Prędkość maksymalna: " + maxSpeed + '\n' +
                "Zasięg: " + range + '\n';
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void drive(int droveDistance) {
        if (droveDistance > this.range) {
            System.out.println("Za daleki dystans. Musisz zatankować");
        } else {
            this.mileage += droveDistance;
            this.range -= droveDistance;
        }
    }

    public void addFuel() {
        this.range = maxRange;
    }
}