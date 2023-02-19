package models.produtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Livro extends Produto{
    private String editora;
    private int numeroDePaginas;
    private int anoLancamento;

    public Livro(String nome, Double preco, String categoria, String marca, String editora, int numeroDePaginas, int anoLancamento) {
        super(nome, preco, categoria, marca);
        this.editora = editora;
        this.numeroDePaginas = numeroDePaginas;
        this.anoLancamento = anoLancamento;
    }
}
