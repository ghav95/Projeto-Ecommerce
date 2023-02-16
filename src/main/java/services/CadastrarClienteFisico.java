package services;

import java.util.Scanner;

import models.usuarios.ClientePessoaFisica;
import services.validadores.ValidarCPF;

public class CadastrarClienteFisico {

     public static void cadastrar() {

          if(cadastrarClienteFisico()){
               System.out.println("\033[32mCliente cadastrado com sucesso!\033[m");
               InicioCliente.iniciar();
          } else{
               System.out.println("\033[32mErro: Cliente não cadastrado!\033[m");
               //Login.login();
          }

     }

     public static boolean cadastrarClienteFisico(){
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

          new ClientePessoaFisica(nome, login, senha, email, cpfcnpj);

          return true;
     }

}
