package services;

import models.produtos.Produto;
import services.CadastrarProduto;
import services.Login;

import java.util.Scanner;

public class InicioAdministrador {

    public static void iniciar(){
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        while (continuar){
            imprimirMenu();
            continuar = navegacao(sc.nextInt());
        }
    }

    private static void imprimirMenu(){
        System.out.println("-----------------------------------------");
        System.out.println("|  #  |     SERVIÇOS DISPONÍVEIS        |");
        System.out.println("-----------------------------------------");
        System.out.println("|  1  | Cadastrar Produto               |");
        System.out.println("|  2  | Visualizar lista de produtos    |");
        System.out.println("|  3  | Editar produto                  |");
        System.out.println("|  4  | Remover produto                 |");
        System.out.println("|  5  | Sair                            |");
        System.out.println("|_______________________________________|");
        System.out.print("\033[34;7mDigite a opção desejada:\033[m ");
    }

    private static boolean navegacao(int escolhaMenu){
        switch (escolhaMenu) {
            case 1 -> CadastrarProduto.cadastrar();
            case 2 -> Produto.listAll();
            case 3 -> Produto.editar();
            case 4 -> Produto.remove();
            case 5 -> {
                Login.login();
                return false;
            }
        }
        return true;
    }
}
