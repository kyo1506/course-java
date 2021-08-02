package aulas.collections;

public record Estudante(String nome, Integer idade) implements Comparable<Estudante> {

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade;
    }

    @Override
    public int compareTo(Estudante o) {
        return this.getIdade() - o.getIdade();
    }
}
