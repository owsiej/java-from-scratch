package main.modul4.zadania;

class Main3 {
    public static void main(String[] args) {
        System.out.println(StringConcatenator.concatenate("lalala", "bababab", "gsdfgdsfg", "435345", "gd345"));
    }
}

class StringConcatenator {
    public static String concatenate(String text1, String text2) {
        return text1 + text2;

    }

    public static String concatenate(String... text) {
        String result = "";
        for (String el : text) {
            result += el;
        }
        return result;

    }
}
