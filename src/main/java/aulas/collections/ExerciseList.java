package aulas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        nomes.forEach(System.out::println);

        nomes.set(2, "Roberto");

        System.out.println(nomes);

        System.out.println(nomes.get(0));

        nomes.remove(3);

        nomes.remove("João");

        System.out.println(nomes.size());

        System.out.println(nomes.contains("Juliano"));

        List<String> nomes2 = new ArrayList<>();

        nomes.add("Ismael");
        nomes.add("Rodrigo");

        nomes.addAll(nomes2);

        Collections.sort(nomes);

        System.out.println(nomes.isEmpty());
    }
}
