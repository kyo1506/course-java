package aulas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Lucas");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.forEach(System.out::println);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("João");

        System.out.println(nomes);

        String s = nomes.get(3);

        System.out.println(s);

        System.out.println(nomes.size());
    }
}
