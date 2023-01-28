package entidades;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClientePessoaJuridica extends Pessoa{
    private String cnpj;
    private String nomeFantasia;

}
