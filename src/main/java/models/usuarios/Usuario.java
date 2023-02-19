package models.usuarios;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Usuario implements Pessoa{

    int id;
    public static List<Usuario> listUsuario = new ArrayList<>();
    String nome, login, senha, email, cpfcnpj;

    Usuario() {

    }

    public Usuario(String nome, String login, String senha, String email, String cpfcnpj) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.cpfcnpj = cpfcnpj;
        listUsuario.add(this);
        this.id = listUsuario.indexOf(this);
    }

    public static Usuario getById(int id) {
        for (Usuario usuario : listUsuario){
            if(usuario.getId() == id){
                return usuario;
            }
        }
        return null;
    }

    public static Usuario getByCPFCNPJ(String cpfcnpj) {
        for (Usuario usuario : listUsuario){
            if(usuario.getCpfcnpj().equals(cpfcnpj)){
                return usuario;
            }
        }
        return null;
    }

    public static Usuario getByLogin(String login) {
        for (Usuario usuario : listUsuario){
            if(usuario.getLogin().equals(login)){
                return usuario;
            }
        }
        return null;
    }

}
