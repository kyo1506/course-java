package aulas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main(String[] args) {
        List<Estudante> estudanteList = new ArrayList<>();

        estudanteList.add(new Estudante("Pedro", 19));
        estudanteList.add(new Estudante("Carlos", 23));
        estudanteList.add(new Estudante("Mariana", 21));
        estudanteList.add(new Estudante("João", 18));
        estudanteList.add(new Estudante("Thiago", 20));
        estudanteList.add(new Estudante("George", 22));
        estudanteList.add(new Estudante("Larissa", 21));

        System.out.println("--- ordem de inserção ---");
        System.out.println(estudanteList);

        estudanteList.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("--- ordem natural dos números - idade ---");
        System.out.println(estudanteList);

        estudanteList.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("--- ordem reversa dos números - idade ---");
        System.out.println(estudanteList);

        estudanteList.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("--- ordem natural dos números - idade (method reference) ---");
        System.out.println(estudanteList);

        estudanteList.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

        System.out.println("--- ordem reversa dos números - idade (method reference) ---");
        System.out.println(estudanteList);

        Collections.sort(estudanteList);

        System.out.println("--- ordem natural dos números - idade (interface reference) ---");
        System.out.println(estudanteList);

        estudanteList.sort(new EstudanteOrdemIdadeReversaComparator());

        System.out.println("--- ordem natural dos números - idade (interface reference) ---");
        System.out.println(estudanteList);

    }
}
