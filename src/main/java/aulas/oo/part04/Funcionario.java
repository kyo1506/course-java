package aulas.oo.part04;

public class Funcionario {

    public Funcionario(String nome, double salario)
    {
        this.nome = nome;
        this.salario = salario;
    }

    private String nome;
    private double salario;

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
}
