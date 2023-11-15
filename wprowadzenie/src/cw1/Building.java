package cw1;

import java.util.Arrays;

public class Building {
    private String name;
    private Item[] items;

    public Building(String name, Item[] items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Item[] getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
