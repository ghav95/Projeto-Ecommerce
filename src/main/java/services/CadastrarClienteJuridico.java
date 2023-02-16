package services;

import models.usuarios.ClientePessoaJuridica;
import services.validadores.ValidarCNPJ;

import java.util.Scanner;

public class CadastrarClienteJuridico {

    public static void cadastrar() {
        String nome, login, senha, endereco, email, cpfcnpj;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = sc.next();

        cpfcnpj = CadastrarCPFCNPJValido.getCPNJValido();

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
