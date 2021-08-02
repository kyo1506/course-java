package aulas.collections;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Stream;

public class ExerciseComparator {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Ka", "Ford", 2021));
        carros.add(new Carro("Monza", "Chevrolet", 2022));
        carros.add(new Carro("Clio", "Renault", 2003));

        System.out.println(carros);

        carros.sort(Comparator.comparingInt(Carro::getAno));

        System.out.println(carros);

        carros.sort((o1, o2) -> o2.getAno() - o1.getAno());

        System.out.println(carros);

        Collections.sort(carros);

        System.out.println(carros);

        TreeSet<Carro> carrosSet = new TreeSet<>();

        carrosSet.add(new Carro("Ka", "Ford", 2021));
        carrosSet.add(new Carro("Monza", "Chevrolet", 2022));
        carrosSet.add(new Carro("Clio", "Renault", 2003));

        System.out.println(carrosSet);

        Stream<Carro> sorted = carrosSet.stream().sorted();

        System.out.println(sorted);

        //Qual país de origem
        TreeMap<Carro, String> carrosMap = new TreeMap<>();

        carrosMap.put(new Carro("Ka", "Ford", 2021), "EUA");
        carrosMap.put(new Carro("Nick", "Nissan", 2022), "JP");
        carrosMap.put(new Carro("Koko", "Nissan", 1998), "JP");
        carrosMap.put(new Carro("Kulku", "Nissan", 2001), "LOL");
        carrosMap.put(new Carro("Clio", "Renault", 2003), "FR");

        System.out.println(carrosMap);
    }
}
