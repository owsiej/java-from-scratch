package main.modul4.mod4_zad4;

public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int daysOfMonth;

    Months(int daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
    }

    public int getDaysOfMonth() {
        return daysOfMonth;
    }
}
