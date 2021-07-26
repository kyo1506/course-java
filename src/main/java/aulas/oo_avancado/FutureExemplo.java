package aulas.oo_avancado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureExemplo {
    private static final ExecutorService threadPool = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        Casa casa = new Casa(new Quarto());
        casa.obterAfazaresDaCasa().forEach(atividade -> threadPool.execute(atividade::realizar));
        threadPool.shutdown();
    }
}

class Casa
{
    private List<Comodo> comodos;

    Casa(Comodo... comodos){this.comodos = Arrays.asList(comodos);}

    List<Atividade> obterAfazaresDaCasa()
    {
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<>(), (pivo, atividades) -> {
                   pivo.addAll(atividades);
                   return pivo;
                });
    }
}

interface Atividade
{
    void realizar();
}

abstract class Comodo
{
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo
{
    @Override
    List<Atividade> obterAfazeresDoComodo() {
        return Arrays.asList(
                this::getArrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private void arrumarGuardaRoupa()
    {
        System.out.println("Arrumar guarda roupa.");
    }

    private void varrerOQuarto()
    {
        System.out.println("Varrer o quarto.");
    }

    private void getArrumarACama()
    {
        System.out.println("Varrer o quarto.");
    }
}