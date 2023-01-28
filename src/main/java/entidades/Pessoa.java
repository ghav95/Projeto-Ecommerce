package entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Pessoa {
    List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    int idPessoa;
    String nome;
    String login;
    String senha;
    String endereco;
    String email;

//    int isAdministrador;
}
