package aulas.oo_basico.part04;

public class Atendente extends Funcionario{

    public Atendente(String nome, double salario) {
        super(nome, salario);
    }

    public double getImposto()
    {
        return this.getSalario() * 0.01;
    }
}
