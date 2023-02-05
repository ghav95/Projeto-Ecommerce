package models.usuarios.produtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Informatica extends Produto {
    public Informatica( String nome, Double preco, String categoria, String marca) {
        super( nome, preco, categoria, marca);
    }

    public enum Categoria{
      CELULAR,
      ACESSORIOS,
      NOTEBOOK,
      PC_GAMER
  };

}
