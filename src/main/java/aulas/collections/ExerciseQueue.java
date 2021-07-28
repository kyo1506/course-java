package aulas.collections;

import java.util.*;

public class ExerciseQueue {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        nomes.forEach(System.out::println);

        System.out.println(nomes.peek());

        System.out.println(nomes.poll());

        nomes.add("Daniel");

        System.out.println(nomes);

        System.out.println(nomes.size());

        System.out.println(nomes.isEmpty());

        System.out.println(nomes.contains("Carlos"));
    }
}
