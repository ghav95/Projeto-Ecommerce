import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mercado extends Produto{
    private double peso;

    public Mercado(int idProduto, String nome, double preco, Enum<Categoria> categoria, String marca, double peso) {
        super(idProduto, nome, preco, categoria, marca);
        this.peso = peso;
    }
}
