package aulas.oo.part01.paradigma.exemplo001;

public class Carros
{
    private int totalpessoas = 0;

    public void numeroDePessoas()
    {
        System.out.println(String.format("O número total de pessoas dentro do carro é %s", totalpessoas));
    }

    public void adicionarPessoas()
    {
        if (totalpessoas > 10)
        {
            System.out.println("Carro lotado!");
        }else
        {
            totalpessoas++;

            System.out.println("Adicionado com sucesso!");
        }
    }

    public void removerPessoas()
    {
        if(totalpessoas == 1)
        {
            System.out.println("Não há como remover mais, pois só resta o motorista.");
        }else
        {
            totalpessoas--;

            System.out.println("Removido com sucesso!");
        }
    }
}
