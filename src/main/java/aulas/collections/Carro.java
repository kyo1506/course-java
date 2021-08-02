package aulas.collections;

public record Carro(String modelo, String marca, Integer ano) implements Comparable<Carro> {

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return modelo + " - " + marca + " - " + ano;
    }

    @Override
    public int compareTo(Carro o) {
        return this.getAno() - o.getAno();
    }
}
