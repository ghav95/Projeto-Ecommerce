package models.usuarios;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Cliente implements Pessoa<Cliente>{
    public static List<Cliente> listCliente = new ArrayList<>();
    int id;
    String nome = "";
    String login= "";
    String senha = "";
    String email = "";
    String cpfcnpj = "";

    public Cliente(String nome, String login, String senha, String email, String cpfcnpj) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.cpfcnpj = cpfcnpj;
        listCliente.add(this);
        this.id = listCliente.indexOf(this);
    }

    public Cliente() {
    }

    @Override
    public Cliente getById(int id) {
        for (Cliente a : listCliente){
            if(a.getId() == id) return a;
        }
        return null;
    }

    @Override
    public Cliente getByCpf(String cpfcnpj) {
        for (Cliente a : listCliente){
            if(a.getCpfcnpj().equals(cpfcnpj)) return a;
        }
        return null;
    }

    @Override
    public Cliente getByLogin(String login) {
        for (Cliente a : listCliente){
            if(a.getLogin().equals(login)) return a;
        }
        return null;
    }
}
