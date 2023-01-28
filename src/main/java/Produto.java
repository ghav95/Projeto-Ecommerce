import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Produto {
    private List<Produto> listaProdutos = new ArrayList<Produto>();
    private int idProduto;
    private String nome;
    private double preco;
    private Enum<Categoria> categoriaEnum;
    private String marca;

}
