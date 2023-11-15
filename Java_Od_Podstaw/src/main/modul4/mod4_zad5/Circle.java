package main.modul4.mod4_zad5;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getType() {
        String fullClassName = this.getClass().toString();
        return fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
}
