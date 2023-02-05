package models.usuarios.produtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mercado extends Produto{
    private double peso;

    public Mercado(String nome, Double preco, String categoria, String marca) {
        super( nome, preco, categoria, marca);
    }
}
