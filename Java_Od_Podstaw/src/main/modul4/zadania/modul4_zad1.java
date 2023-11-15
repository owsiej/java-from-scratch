package main.modul4.zadania;

class Main2 {
    public static void main(String[] args) {
        System.out.println(Calculator.add(4.4f, 42.6f));
    }
}

class Calculator {
    public static int add(int numb1, int numb2) {
        return numb1 + numb2;
    }

    public static double add(double numb1, double numb2) {
        return numb1 + numb2;
    }

    public static float add(float numb1, float numb2) {
        return numb1 + numb2;
    }

    public static long add(long numb1, long numb2) {
        return numb1 + numb2;
    }
}