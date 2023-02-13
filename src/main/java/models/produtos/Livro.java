package models.produtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Livro extends Produto{
    private String editora;
    private int numeroDePaginas;
    private int anoLancamento;

    public Livro(String nome, Double preco, String categoria, String marca) {
        super(nome, preco, categoria, marca);

    }
}
