package aulas.oo.part02.construtores;

import java.util.Optional;

public class Carro {
    public Carro(String Modelo, String Marca, int Ano)
    {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Ano = Ano;
    }

    public Carro(String Modelo, String Marca, int Ano, String Variante)
    {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Ano = Ano;
        this.Variante = Variante;
    }

    String Modelo;
    String Marca;
    String Variante;
    Integer Ano;
}
