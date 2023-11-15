package cw1;

import java.util.Arrays;

public class Criminal extends Person{
    static final int  SUCCESS_PERCENTAGE = 20;

    public Criminal(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickname, yearOfBorn, expertIn, items);
    }

    @Override
    public String toString() {
        return "\nCriminal person:\n" +
                "name='" + name + '\'' +
                "\nnickname='" + nickname + '\'' +
                "\nyearOfBorn=" + yearOfBorn +
                "\nexpertIn='" + expertIn + '\'' +
                "\nitems=" + Arrays.toString(items);
    }
}
