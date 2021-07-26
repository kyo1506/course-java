package aulas.oo_basico.part04;

public class Supervisor extends Funcionario{

    public Supervisor(String nome, double salario) {
        super(nome, salario);
    }

    public double getImposto()
    {
        return this.getSalario() * 0.05;
    }
}
