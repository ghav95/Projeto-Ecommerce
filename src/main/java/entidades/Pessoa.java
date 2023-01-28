package entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Pessoa {
    private List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    private int idPessoa;
    private String nome;
    private String login;
    private String senha;
    private String endereco;
    private String email;

//    int isAdministrador;
}
