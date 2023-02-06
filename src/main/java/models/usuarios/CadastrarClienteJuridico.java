package models.usuarios;

import models.usuarios.validadores.ValidarCNPJ;

import java.util.Scanner;

public class CadastrarClienteJuridico {

    public static void cadastrar() {
        String nome;
        String login;
        String senha;
        String endereco;
        String email;
        String cpfcnpj;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = sc.next();

        System.out.print("Digite o cnpj: ");
        cpfcnpj = sc.next();
        int tentativas = 0;
        while (!ValidarCNPJ.isValido(cpfcnpj)) {
            System.out.print("\033[1;31mCNPJ inválido!\033[m Digite novamente: ");
            cpfcnpj = sc.next();
            if (tentativas >= 3){
                InicioCadastroPerfil.iniciar();
                break;
            }
            tentativas++;
        }

        System.out.print("Digite o login: ");
        login = sc.next();

        System.out.print("Digite a senha: ");
        senha = sc.next();

        System.out.print("Digite o email: ");
        email = sc.next();

        System.out.print("Digite o endereco: ");
        endereco = sc.next();

        new ClientePessoaJuridica(nome, login, senha, email, cpfcnpj);

        System.out.println("\033[32mCliente cadastrado com sucesso!\033[m");

        InicioCliente.iniciar();
    }
}
