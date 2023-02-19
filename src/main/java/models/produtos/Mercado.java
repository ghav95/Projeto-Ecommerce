package models.produtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class Mercado extends Produto{
    private double peso;

    public Mercado(String nome, Double preco, String categoria, String marca, double peso) {
        super(nome, preco, categoria, marca);
        this.peso = peso;
    }
}
