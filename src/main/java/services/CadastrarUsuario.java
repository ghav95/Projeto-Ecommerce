package services;

import models.usuarios.Cliente;
import services.validadores.ValidarCPF;

import java.util.Scanner;

public class CadastrarUsuario {


    public static Cliente cadastrarCliente(){
        String nome, login, senha, endereco, email, cpfcnpj;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = sc.next();

        cpfcnpj = CadastrarCPFCNPJValido.getCPFValido();

        System.out.print("Digite o login: ");
        login = sc.next();

        System.out.print("Digite a senha: ");
        senha = sc.next();

        System.out.print("Digite o email: ");
        email = sc.next();

        System.out.print("Digite o endereco: ");
        endereco = sc.next();

        return new Cliente(nome, login, senha, email, cpfcnpj);
    }


}
