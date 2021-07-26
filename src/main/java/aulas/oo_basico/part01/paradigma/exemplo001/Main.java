package aulas.oo_basico.part01.paradigma.exemplo001;

public class Main {
    public static void main (String[] args)
    {
        Carros carros = new Carros();

        carros.numeroDePessoas();

        for (int i = 0; i < 10; i++)
            carros.adicionarPessoas();

        carros.numeroDePessoas();

        for (int i = 0; i < 5; i++)
            carros.removerPessoas();

        carros.numeroDePessoas();
    }
}
