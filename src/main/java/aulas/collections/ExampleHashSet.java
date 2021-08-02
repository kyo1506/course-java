package aulas.collections;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);

        System.out.println(notasAlunos);

        notasAlunos.remove(9.3);

        System.out.println(notasAlunos);

        notasAlunos.forEach(System.out::println);
    }
}
