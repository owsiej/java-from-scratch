package pl_podstawy.wprowadzenie;

import java.util.*;

public class Kolekcje_Map {

    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
        System.out.println(map);
        System.out.println(map.get("A")); //jeżeli klucz nie istnieje zwraca null
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue(11));
        System.out.println(map.keySet());
        System.out.println(map.values());

//  HashMap - elementy w mapie nie są posortowane ani wyświetlanie w kolejności dodania
        Map<String, Integer> hashMap = new HashMap<>(map);
        hashMap.put("F", 5); //jeżeli dany klucz istnieje to zwraca jego wartość i zastępuje nową
        hashMap.put("W", 100);
        hashMap.put("D", 50);
        System.out.println(hashMap);

//  LinkedHashMap - elementy wyświetlane są w kolejności dodawania, nieposortowane;
//        * wolniejsza do dodawania i usuwania danych
//        * szybsza do iterowania
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("F", 25);
        linkedHashMap.put("A", 15);
        linkedHashMap.put("Z", 5);
        linkedHashMap.put("L", 100);
        System.out.println(linkedHashMap);

//  TreeMap - dane wyświetlane są w posortwanej kolejności;
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("F", 25);
        treeMap.put("A", 15);
        treeMap.put("Z", 5);
        treeMap.put("L", 100);
        System.out.println(treeMap);
//  * implementuje inteferjs NavigableMap
        System.out.println(treeMap.higherKey("F")); //wyrzuca następny wyższy klucz od podanego
        System.out.println(treeMap.ceilingKey("G")); //wyrzuca następny wyższy lub równy klucz od podanego
        System.out.println(treeMap.lowerKey("F")); //wyrzuca następny niższy klucz od podanego
        System.out.println(treeMap.floorKey("F")); //wyrzuca następny niższy lub równy klucz od podanego
        System.out.println(treeMap.firstEntry()); //wyrzuca pierwsza pare klucz-wartość
        System.out.println(treeMap.lastEntry()); //wyrzuca ostatnia pare klucz-wartosc
        System.out.println(treeMap.subMap("A", "Y")); //wyrzuca Mape w zakresie podanych kluczy

//  ćwiczenie na tworzenie słownika z stringów
        String text = "This is a great thing";
        HashMap<Character, Integer> occurances = new HashMap<>();
        ArrayList<String> words = new ArrayList<>(Arrays.asList(text.split(" ")));
        System.out.println(words);

        for (int i=0; i<text.length(); i++) {
            if (!occurances.containsKey(text.charAt(i))) {
                occurances.put(text.charAt(i), 1);
            } else {
                Integer value = occurances.get(text.charAt(i));
                value++;
                occurances.put(text.charAt(i), value);
            }
        }
        System.out.println(occurances);
    }
}
