package cw1;

import java.util.Arrays;

public abstract class Person {

    protected String name;
    protected String nickname;
    protected int yearOfBorn;
    protected String expertIn;
    protected Item[] items;

    public Person(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.expertIn = expertIn;
        this.items = items;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", yearOfBorn=" + yearOfBorn +
                ", expertIn='" + expertIn + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }
}
