package models.usuarios;

public class Cliente extends Usuario{

    public Cliente(String nome, String login, String senha, String email, String cpfcnpj) {
        super(nome, login, senha, email, cpfcnpj);
    }

    public Cliente() { }

}
