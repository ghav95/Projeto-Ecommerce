package services;

import models.usuarios.Administrador;
import services.validadores.ValidarCPF;

import java.util.Scanner;

public class CadastrarAdministrador {

    public static void cadastrar(){

        if(cadastrarAdministrador()) {
            System.out.println("\033[32mAdministrador cadastrado com sucesso!\033[m");
            InicioAdministrador.iniciar();
        } else {
            System.out.println("\033[32mErro: Administrador não cadastrado!\033[m");
            Login.login();
        }

    }

    public static boolean cadastrarAdministrador(){
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

        new Administrador(nome, login, senha, email, cpfcnpj);

        return true;
    }

}
