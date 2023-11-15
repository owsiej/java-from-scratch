package cw1;

import java.util.Arrays;

public class City {
    private Building[] buildings = new Building[4];

    public City() {
        Item letterOpener = new Item("Letter opener", 1.5);
        Item stamp = new Item("Stamp", 2.5);
        Building bank = new Building("Bank", new Item[]{letterOpener, stamp});
        buildings[0]=bank;

        Item pairOfFancyShoes = new Item("Pair of fancy shoes", 25);
        Item brokenGlass = new Item("Broken Glass", 0.1);
        Building mansion = new Building("Mansion", new Item[]{pairOfFancyShoes, brokenGlass});
        buildings[1]=mansion;

        Item letterToJenny = new Item("Letter to Jenny", 1.5);
        Item pencil = new Item("Pencil", 2.0);
        Building postOffice = new Building("Post Office", new Item[]{letterToJenny, pencil});
        buildings[2]=postOffice;

        Item aLoafOfBread = new Item("A loaf of bread", 2.5);
        Item aBagOfTea = new Item("A bag of tea", 6.5);
        Building supermarket = new Building("Supermarket", new Item[]{aLoafOfBread, aBagOfTea});
        buildings[3]=supermarket;

    }

    public Building[] getBuildings() {
        return buildings;
    }

    @Override
    public String toString() {
        return "City{" +
                "buildings=" + Arrays.toString(buildings) +
                '}';
    }
}
