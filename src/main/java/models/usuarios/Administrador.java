package models.usuarios;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Administrador implements Pessoa<Administrador>{

    public static List<Administrador> listAdministrador = new ArrayList<>();
    int id = 0;
    String nome = "";
    String login= "";
    String senha = "";
    String email = "";
    String cpfcnpj = "";

    public Administrador() {
    }

    public Administrador(String nome, String login, String senha, String email, String cpfcnpj) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.cpfcnpj = cpfcnpj;
        listAdministrador.add(this);
        this.id = listAdministrador.indexOf(this);
    }

    @Override
    public Administrador getById(int id) {
        for (Administrador a : listAdministrador){
            if(a.getId() == id) return a;
        }
        return null;
    }

    @Override
    public Administrador getByCpf(String cpfcnpj) {
        for (Administrador a : listAdministrador){
            if(a.getCpfcnpj().equals(cpfcnpj)) return a;
        }
        return null;
    }

    @Override
    public Administrador getByLogin(String login) {
        for (Administrador a : listAdministrador){
            if(a.getLogin().equals(login)) return a;
        }
        return null;
    }
}
