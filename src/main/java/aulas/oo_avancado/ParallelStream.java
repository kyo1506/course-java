package aulas.oo_avancado;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        //Serial
        for (int i = 1; i < 10000; i++) {
            fatorial(i);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial :: "+(fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1, 10000).parallel().forEach(ParallelStream::fatorial);//Parallel
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel :: "+(fim-inicio));

        List<String> nomes = Arrays.asList("Joao", "Paulo", "Santos", "Oliveira");
        nomes.parallelStream().forEach(System.out::println);
    }

    private static long fatorial(long num)
    {
        long fat = 1;

        for (long i = 2; i < num; i++) {
            fat *= i;
        }
        return fat;
    }
}
