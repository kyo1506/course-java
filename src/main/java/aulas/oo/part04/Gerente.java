package aulas.oo.part04;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double getImposto()
    {
        return this.getSalario() * 0.1;
    }
}
