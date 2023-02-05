package models.usuarios;

import models.usuarios.validadores.ValidarCNPJ;
import models.usuarios.validadores.ValidarCPF;

import java.util.Scanner;

public class CadastrarAdministrador {

    public static void cadastrar(){
        String nome;
        String login;
        String senha;
        String endereco;
        String email;
        String cpfcnpj;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = sc.next();

        System.out.print("Digite o cpf: ");
        cpfcnpj = sc.next();
        while (!ValidarCPF.isValido(cpfcnpj)) {
            System.out.print("CPF inválido! Digite novamente: ");
            cpfcnpj = sc.next();
        }

        System.out.print("Digite o login: ");
        login = sc.next();

        System.out.print("Digite a senha: ");
        senha = sc.next();

        System.out.print("Digite o email: ");
        email = sc.next();

        System.out.print("Digite o endereco: ");
        endereco = sc.next();

        new Administrador(nome, login, senha, email, cpfcnpj);

        System.out.println("Administrador cadastrado com sucesso!");
        InicioAdministrador.iniciar();
    }
}
