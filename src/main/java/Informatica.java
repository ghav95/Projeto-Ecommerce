import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Informatica extends Produto{
    private String modelo;
    private boolean isImportado;
    private boolean isSoftware;

    public Informatica(String modelo, boolean isImportado, boolean isSoftware, int idProduto, String nome, double preco, Enum<Categoria> categoria, String marca) {
        super(idProduto, nome, preco, categoria, marca);

        this.modelo = modelo;
        this.isImportado = isImportado;
        this.isSoftware = isSoftware;
    }
}
