package pl_podstawy.wprowadzenie;

import com.sun.source.tree.Tree;

import java.util.*;

public class Kolekcje_Set {
    public static void main(String[] args) {

//  HashSet - przy dodawaniu zmiennych do HashSetu, kolejność dodawanie nie ma związku z ułożeniem zmiennych w secie
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(4234);
        hashSet.add(423);
        hashSet.add(42);
        hashSet.add(4);
        System.out.println(hashSet);

//  LinkedHashSet - elementy dodawane są zawsze na końcu setu
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(4234);
        numbers.add(423);
        numbers.add(42);
        numbers.add(4);
        System.out.println(numbers);

//  TreeSet - dodawane elementy są od razu sortowane rosnąco
        NavigableSet<Integer> numbersTree = new TreeSet<>();
        numbersTree.add(4234);
        numbersTree.add(423);
        numbersTree.add(42);
        numbersTree.add(4);
        System.out.println(numbersTree);
        System.out.println(numbersTree.floor(42));
        System.out.println(numbersTree.lower(42));
        System.out.println(numbersTree.ceiling(43));
        System.out.println(numbersTree.higher(42));
        System.out.println(numbersTree.subSet(40,424));
        System.out.println(numbersTree.subSet(42,true,423,true));
        System.out.println(numbersTree.headSet(50));
        System.out.println(numbersTree.tailSet(50));

//  implementacja interfejsu Comparator aby zmienić rodzaj sortowania
        List<Character> chars = List.of('A', 'Z', 'A', 'B', 'Z', 'F', 'a');
        Set<Character> uniqueChars= new TreeSet<>(new DescendingComparator2());
        for (Character chr:chars) {
            uniqueChars.add(chr);
        }
        System.out.println(uniqueChars);
    }
}
class DescendingComparator2 implements Comparator<Character> {

    @Override
    public int compare(Character s1, Character s2) {
        return Character.compare(Character.toLowerCase(s1),Character.toLowerCase(s2));
    }

}