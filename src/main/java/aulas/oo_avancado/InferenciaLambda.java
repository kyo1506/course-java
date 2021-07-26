package aulas.oo_avancado;

import java.util.function.Function;

public class InferenciaLambda {
    public static void main(String[] args) {
        Function<Integer, Double> divisaoPorDois = numero -> numero/2.0;

        System.out.println(divisaoPorDois.apply(9849387));
    }
}
