package pl_podstawy.wprowadzenie_oop;


import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class cwiczenia {
    public static void main(String[] args) {
//        saldo saldo = new saldo(0);
//        saldo.deposit(4234.234);
//        System.out.println(saldo.checkBalance());
        ////////////////////////////////////////////
/*        Butelka[] magazyn = new Butelka[3];
        float v=1.5f;
        int i=0;
        for (Butelka butelka: magazyn) {

            butelka=new Butelka(v,0);
            magazyn[i++]=butelka;
            v+=0.4;
            System.out.println(butelka.getPojemnosc());
        }
        System.out.println();
        magazyn[0].dodajWody(1.0f);
        magazyn[1].dodajWody(1.5f);
        magazyn[2].dodajWody(2.0f);
        magazyn[0].przelejWodeZButelkiDoButelki(magazyn[1], 0.7f);
        System.out.println(magazyn[0].getIleLitrow());
        System.out.println(magazyn[1].getIleLitrow());
        System.out.println(magazyn[2].getIleLitrow());
  */
        ///////////////////////////////////////////
        /*
        Pracownik[] osoby = new Pracownik[4];
        osoby[0] = new Pracownik(5000);
        osoby[1] = new Pracownik(8000);
        osoby[2] = new Pracownik(3000);
        osoby[3] = new Pracownik(6000);

        Arrays.sort(osoby);
        Arrays.sort(osoby, Collections.reverseOrder());

        System.out.println(osoby[3].wynagrodzenie);
        Pracownik Zenek = new Pracownik(5000);
        Pracownik Stas = new Pracownik("Stas", "Lolek");
        Zenek.pobierzOpis();
        Stas.pobierzOpis();

         */
//        Student1 student1 = new Student1("Michał", 423423423, "lolol@.com", "Pb", "1");

        /*
        System.out.println("How invented a light bulb?");
        System.out.println("A)");
        System.out.println("B)");
        System.out.println("C)");
        System.out.println("D)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (Objects.equals(answer, "C")) {
            WhoWantsToBeAMullionareApp.isCorrect=true;
        } else {
            WhoWantsToBeAMullionareApp.isCorrect=false;
        }
        System.out.println(WhoWantsToBeAMullionareApp.checkAnswer(WhoWantsToBeAMullionareApp.isCorrect)); */
/*
        Actress lola = new Actress("Lola", LocalDate.of(1992, 2, 11), new String[]{"movie1", "movie2"}, new int[]{1, 2});
        System.out.println(lola.getAge());
        System.out.println(lola.getMovies());
        System.out.println(lola.getRatings());
        */


//        for (char c = 'A'; c <= 'F'; c++) {
//            System.out.println(c);
//        }



    }

        class saldo {
            private double balance = 0;

            public saldo(double balance) {
                this.balance = balance;
            }

            public void deposit(double money) {
                balance += money;
            }

            public void withdraw(double money) {
                if (money > balance) {
                    System.out.println("Nie masz wystarczających środków na koncie.");
                } else {
                    balance -= money;
                }
            }

            public double checkBalance() {
                return balance;
            }

        }

        class Butelka {
            private float pojemnosc = 0;
            private float ileLitrow = 0;

            public Butelka(float pojemnosc, float ileLitrow) {
                this.pojemnosc = pojemnosc;
                this.ileLitrow = ileLitrow;
            }

            public float getPojemnosc() {
                return pojemnosc;
            }

            public float getIleLitrow() {
                return ileLitrow;
            }

            public void setIleLitrow(float ileLitrow) {
                this.ileLitrow = ileLitrow;
            }

            public void wylejWode(float iloscWody) {
                if (this.getIleLitrow() < iloscWody) {
                    System.out.println("Nie masz wystarczającej ilości wody. Wylano wszystko do końca");
                    this.setIleLitrow(0);
                } else {
                    ileLitrow -= iloscWody;
                }
            }

            public void dodajWody(float iloscWody) {
                if (this.getIleLitrow() + iloscWody > this.getPojemnosc()) {
                    System.out.println("W butelce zostało mniej miejsca niż jest wody do dodania. Zalano butelce pod korek.");
                    this.setIleLitrow(this.pojemnosc);
                } else {
                    ileLitrow += iloscWody;
                }
            }

            public void przelejWodeZButelkiDoButelki(Butelka but, float iloscWody) {
                if (this.pojemnosc < iloscWody) {
                    System.out.println("Za mało wody w butelce do przelania.");
                } else {
                    this.wylejWode(iloscWody);
                    but.dodajWody(iloscWody);
                }
            }
        }

        abstract class Osoba {
            String imie;
            String nazwisko;

            public Osoba() {
            }

            public Osoba(String imie, String nazwisko) {
                this.imie = imie;
                this.nazwisko = nazwisko;
            }

            abstract void pobierzOpis();

        }

        class Pracownik extends Osoba implements Comparable {
            double wynagrodzenie;

            public Pracownik(double wynagrodzenie) {

                this.wynagrodzenie = wynagrodzenie;
            }

            public Pracownik(String imie, String nazwisko) {
                this.imie = imie;
                this.nazwisko = nazwisko;
            }

            @Override
            void pobierzOpis() {
                System.out.println(this.imie);
                System.out.println(this.nazwisko);
            }

            //  ustala jak ma zachować się sortowanie, Arrays.sort()
            @Override
            public int compareTo(Object o) {
                Pracownik przeslany = (Pracownik) o;
                if (this.wynagrodzenie < przeslany.wynagrodzenie) {
                    return -1;
                } else if (this.wynagrodzenie > przeslany.wynagrodzenie) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        class Student extends Osoba {
            public Student(String imie, String nazwisko) {
                super(imie, nazwisko);
            }

            @Override
            void pobierzOpis() {

            }
        }

        abstract class Shape {
            abstract double getArea();
        }

        class Rectangle extends Shape {

            double length;
            double width;

            public Rectangle(double length, double width) {
                this.length = length;
                this.width = width;
            }


            @Override
            double getArea() {
                return 0;
            }
        }

        class BankAccount {
            private double balance;

            public double getBalance() {
                return balance;
            }

            public BankAccount(double balance) {
                this.balance = balance;
            }

            void deposit() {

            }

            void withdraw(double money) {
                balance -= money;
            }
        }

        class SavingsAccount extends BankAccount {


            public SavingsAccount(double balance) {
                super(balance);
            }

            @Override
            void withdraw(double money) {
                if (getBalance() < 100) {
                    System.out.println("Cant withdraw");
                } else {
                    super.withdraw(money);
                }
            }
        }

        class Person {
            protected String name;
            protected int phone;
            protected String email;

            public Person(String name, int phone, String email) {
                this.name = name;
                this.phone = phone;
                this.email = email;
            }
        }

        class Student1 extends Person {
            private String collage;
            private String cls;

            public Student1(String name, int phone, String email, String collage, String cls) {
                super(name, phone, email);
                this.collage = collage;
                this.cls = cls;
            }

            @Override
            public String toString() {
                return "Student1{" +
                        "collage='" + collage + '\'' +
                        ", cls='" + cls + '\'' +
                        ", name='" + name + '\'' +
                        ", phone=" + phone +
                        ", email='" + email + '\'' +
                        '}';
            }

            public String getCollage() {
                return collage;
            }

            public String getCls() {
                return cls;
            }
        }

        class WhoWantsToBeAMullionareApp {
            static boolean isCorrect;

            static String checkAnswer(boolean isCorrect) {
                return isCorrect ? "Good answer" : "Bad answer";
            }
        }

        class Actress {
            private String name;
            private LocalDate dateOfBirth;
            private String[] movies;
            private int[] ratings;

            public String getName() {
                return name;
            }

            public LocalDate getDateOfBirth() {
                return dateOfBirth;
            }

            public String getMovies() {
                return Arrays.toString(movies);
            }

            public String getRatings() {
                return Arrays.toString(ratings);
            }

            public Actress(String name, LocalDate dateOfBirth, String[] movies, int[] ratings) {
                this.name = name;
                this.dateOfBirth = dateOfBirth;
                this.movies = movies;
                this.ratings = ratings;
            }

            int getAge() {
                Period age = Period.between(LocalDate.now(), dateOfBirth);
                return Math.abs(age.getYears());
            }
        }
        static class Book {
        int id;
        String name;
        String author;

        List<Review> reviews = new ArrayList<>();

            public Book(int id, String name, String author) {
                this.id = id;
                this.name = name;
                this.author = author;
            }

            public void addReview (Review rev) {
                this.reviews.add(rev);
            }

            @Override
            public String toString() {
                return "Book{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", author='" + author + '\'' +
                        ", reviews=" + reviews +
                        '}';
            }
        }
        static class Review {
        int id;
        String description;
        int rating;

            public Review(int id, String description, int rating) {
                this.id = id;
                this.description = description;
                this.rating = rating;
            }

            @Override
            public String toString() {
                return "Review{" +
                        "id=" + id +
                        ", description='" + description + '\'' +
                        ", rating=" + rating +
                        '}';
            }
        }
    }