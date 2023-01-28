import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Livro extends Produto{
    private String editora;
    private int numeroDePaginas;
    private int anoLancamento;
}
