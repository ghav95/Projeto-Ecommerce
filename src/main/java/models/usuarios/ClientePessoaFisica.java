package models.usuarios;

public class ClientePessoaFisica extends Cliente{

    public ClientePessoaFisica(String nome, String login, String senha, String email, String cpfcnpj) {
        super(nome, login, senha, email, cpfcnpj);
    }

    public ClientePessoaFisica() { }

}
