package pl_podstawy.wprowadzenie;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kolekcje_Queue {



    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Apple"); //dodaje element do kolejki
        queue.addAll(List.of("Zebra", "Monkey", "Catttttt"));
        System.out.println(queue);
        System.out.println(queue.poll()); //wyciąga pierwszy element z kolejki
        System.out.println(queue);
    }
}
class StringComparator implements Comparator<String> {

    @Override
    public int compare(String val1, String val2) {
        return Integer.compare(val1.length(), val2.length());
    }
}