package main.modul4.mod4_zad5;

public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(double a, double v) {
        this.a = a;
    }

    @Override
    public String getType() {
        return "prostokąt";
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
