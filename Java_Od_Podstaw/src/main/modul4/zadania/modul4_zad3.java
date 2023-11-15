package main.modul4.zadania;

import java.util.Objects;

class Main4 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle(3.5, 5.2);
        Rectangle rectangle3 = new Rectangle(5.7);
        System.out.println(rectangle3.equals(rectangle3));
        System.out.println(rectangle1.equals(rectangle2));
    }
}

class Rectangle {
    private double a;
    private double b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;

    }

    public Rectangle(int a) {
        this.a = a;
        this.b = a;
    }

    public Rectangle(double a) {
        this.a = a;
        this.b = a;
    }

    public boolean isSquare() {
        return a == b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(rectangle.a, a) == 0 && Double.compare(rectangle.b, b) == 0) || (Double.compare(rectangle.a, b) == 0 && Double.compare(rectangle.b, a) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}