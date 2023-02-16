package models.usuarios;


public class Administrador extends Usuario{

    public Administrador(String nome, String login, String senha, String email, String cpfcnpj) {
        super(nome, login, senha, email, cpfcnpj);
    }

    public Administrador() {
    }
}
