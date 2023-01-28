import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Livro extends Produto{
    String editora;
    int numeroDePaginas;

    int anoLancamento;
}
