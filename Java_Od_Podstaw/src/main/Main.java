package main;


public class Main {

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(5, 2.3);
//        Triangle triangle = new Triangle(5.3, 6, 5.9);
//        Circle circle = new Circle(8.6);
//        System.out.println(circle.calculateArea());
//        System.out.println(circle.getType());
        String name = "michał";
        String name2 = new String(name);
        name = "bartek";
        System.out.println(name2);
    }

    class Calculator {

        int sum(int a, int b, int c) {
            return a + b + c;
        }

        int sum(int a, int b) {
            return a + b;
        }
    }
}