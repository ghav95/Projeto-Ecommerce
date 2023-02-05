package models.usuarios;

import lombok.Getter;
import lombok.Setter;

public class ClientePessoaFisica extends Cliente{
    public ClientePessoaFisica(String nome, String login, String senha, String email, String cpfcnpj) {
        super(nome, login, senha, email, cpfcnpj);
    }
}
