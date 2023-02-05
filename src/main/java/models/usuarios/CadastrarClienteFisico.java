package models.usuarios;

import java.util.Scanner;

import models.usuarios.validadores.ValidarCPF;

public class CadastrarClienteFisico {

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

          new ClientePessoaFisica(nome, login, senha, email, cpfcnpj);

          System.out.println("Cliente cadastrado com sucesso!");
          InicioCliente.iniciar();

     }
}
