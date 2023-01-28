package entidades;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClientePessoaJuridica extends Pessoa{

    String cnpj;
    String nomeFantasia;

}
