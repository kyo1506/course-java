package aulas.oo_avancado;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Aula {
    public static void main(String[] args)
    {
        int[] valores = {1,2,3,4};

        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(System.out::println);

        for (int valore : valores) {
            int valor;

            if (valore % 2 == 0) {
                valor = valore * 2;

                if (valor != 0) {
                    System.out.println(valor);
                }
            }
        }

        BiPredicate<Integer, Integer> verificarSeEMaior = (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeEMaior.test(12, 13));

        UnaryOperator<Integer> retornarDobro = v -> v * 2;

        System.out.println(retornarDobro.apply(40)); 
    }
}
