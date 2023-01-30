import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Livro extends Produto{
    private String editora;
    private int numeroDePaginas;
    private int anoLancamento;

    public Livro(int idProduto, String nome, double preco, Enum<Categoria> categoria, String marca, String editora, int numeroDePaginas, int anoLancamento) {
        super(idProduto, nome, preco, categoria, marca);

        this.editora = editora;
        this.numeroDePaginas = numeroDePaginas;
        this.anoLancamento = anoLancamento;

    }
}
