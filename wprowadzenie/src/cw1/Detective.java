package cw1;

import java.util.Arrays;

public class Detective extends Person{
    public Detective(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickname, yearOfBorn, expertIn, items);
    }

    final static int SUCCESS_PERCENTAGE=20;

    @Override
    public String toString() {
        return "Detective:%n" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", yearOfBorn=" + yearOfBorn +
                ", expertIn='" + expertIn + '\'' +
                ", items=" + Arrays.toString(items);
    }
}
