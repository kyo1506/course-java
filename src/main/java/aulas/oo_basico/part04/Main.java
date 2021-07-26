package aulas.oo_basico.part04;

public class Main {
    public static void main (String[] args)
    {
        Gerente gerente = new Gerente("Marlon Brando", 20000);
        Supervisor supervisor = new Supervisor("Rui Barbosa", 20000);
        Atendente atendente = new Atendente("Orlando Brum", 20000);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getImposto());

        System.out.println(supervisor.getNome());
        System.out.println(supervisor.getSalario());
        System.out.println(supervisor.getImposto());

        System.out.println(atendente.getNome());
        System.out.println(atendente.getSalario());
        System.out.println(atendente.getImposto());
    }
}
