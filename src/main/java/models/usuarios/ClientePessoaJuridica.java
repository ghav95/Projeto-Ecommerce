package models.usuarios;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClientePessoaJuridica extends Cliente{
    private String cnpj;
    private String nomeFantasia;

}
