import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Produto {

    List<Produto> listaProdutos = new ArrayList<Produto>();
    int idProduto;
    String nome;
    double preco;

    Enum<Categoria> categoriaEnum;

    String marca;

}
