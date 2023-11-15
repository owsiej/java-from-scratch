package guava;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        BiMap<String, String> countriesAndCapitals = HashBiMap.create();
        countriesAndCapitals.put("Polska", "Warszawa");
        countriesAndCapitals.put("Niemcy", "Berlin");
        countriesAndCapitals.put("Francja", "Paryż");
//        odwracanie mapy tak, aby można było wyszukiwać danych po wartościach mapy
//        System.out.println(countriesAndCapitals.inverse().get("Berlin"));

        List<String> names = new ArrayList<>();
        names.add("Kamil");
        names.add("Mariusz");
        names.add(null);
        names.add("Dominik");

//        łączenie stringów z wyrzuceniem nulla
        String joiner = String.join("; ", names);
//        System.out.println(joiner);
        String joiner1 = Joiner.on("; ").skipNulls().join(names);
//        System.out.println(joiner1);
        String joiner2 = Joiner.on("; ").useForNull("Domyślna nazwa").join(names);
//        System.out.println(joiner2);

//        dzielenie stringów
        String longText = ", Kamil,Mariusz,,Dominik ,";
        List<String> formattedText = Splitter.on(",")
                .trimResults()
                .omitEmptyStrings()
                .splitToList(longText);
//        System.out.println(formattedText);

        Map<String, String> map1 = new HashMap<>();
        map1.put("Polska", "Warszawa");
        map1.put("Niemcy", "Berlin");
        map1.put("Francja", "Paryż");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Polska", "Kraków");
        map2.put("Francja", "Paryż");
        map2.put("Czechy", "Praga");
        map2.put("Słowacja", "Bratysława");
        map2.put("Germania", "Berlin");

//        porównywanie różnic dwóch map, entries - po kluczach;'
        MapDifference<String, String> difference = Maps.difference(map1, map2);
        Map<String, MapDifference.ValueDifference<String>> stringValueDifferenceMap = difference.entriesDiffering();
        Map<String, String> entriesOnCommon = difference.entriesInCommon();
        Map<String, String> differenceOfLeft = difference.entriesOnlyOnLeft();
        Map<String, String> differenceOfRight = difference.entriesOnlyOnRight();
        System.out.println(differenceOfLeft);
        System.out.println(differenceOfRight);
    }

    private static int divide(int a, int b) {
        //    sprawdzanie argumentów na wejsciu do metody
        Preconditions.checkArgument(b!=0, "B musi być różne od zera.");
        return a/b;
    }
}
