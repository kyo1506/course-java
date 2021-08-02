package aulas.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExerciseSet {
    public static void main(String[] args) {
        exemploHashSet();
        exemploLinkedHashSet();
        exemploTreeSet();
    }

    static void exemploHashSet()
    {
        Set<Integer> exemploHashSet = new HashSet<>();

        exemploHashSet.add(3);
        exemploHashSet.add(88);
        exemploHashSet.add(20);
        exemploHashSet.add(44);
        exemploHashSet.add(3);

        System.out.println(exemploHashSet);

        exemploHashSet.remove(0);

        exemploHashSet.add(23);

        System.out.println(exemploHashSet.size());

        System.out.println(exemploHashSet.isEmpty());
    }

    static void exemploLinkedHashSet()
    {
        Set<Integer> exemploLinkedHashSet = new LinkedHashSet<>();

        exemploLinkedHashSet.add(3);
        exemploLinkedHashSet.add(88);
        exemploLinkedHashSet.add(20);
        exemploLinkedHashSet.add(44);
        exemploLinkedHashSet.add(3);

        System.out.println(exemploLinkedHashSet);

        exemploLinkedHashSet.remove(0);

        exemploLinkedHashSet.add(23);

        System.out.println(exemploLinkedHashSet.size());

        System.out.println(exemploLinkedHashSet.isEmpty());
    }

    static void exemploTreeSet()
    {
        TreeSet<Integer> exemploTreeSet = new TreeSet<>();

        exemploTreeSet.add(3);
        exemploTreeSet.add(88);
        exemploTreeSet.add(20);
        exemploTreeSet.add(44);
        exemploTreeSet.add(3);

        System.out.println(exemploTreeSet);

        exemploTreeSet.remove(0);

        exemploTreeSet.add(23);

        System.out.println(exemploTreeSet.size());

        System.out.println(exemploTreeSet.isEmpty());
    }
}
