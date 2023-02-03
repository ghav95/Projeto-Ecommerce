package models.usuarios.produtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Informatica extends Produto<Informatica.Categoria>{
    public Informatica( String nome, Double preco, Categoria categoria, String marca) {
        super( nome, preco, categoria, marca);
    }

    public enum Categoria{
      CELULAR,
      ACESSORIOS,
      NOTEBOOK,
      PC_GAMER
  };

}
