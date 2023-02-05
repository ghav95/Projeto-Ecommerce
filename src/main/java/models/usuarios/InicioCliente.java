package models.usuarios;

import models.usuarios.Pessoa;
import models.usuarios.produtos.Produto;

import java.util.Scanner;

public class InicioCliente {
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
        System.out.println("|  1  | Listar Produtos                 |");
        System.out.println("|  2  | Filtrar por categoria           |");
        System.out.println("|  3  | Filtrar por marca               |");
        System.out.println("|  4  | Ordernar por nome (crescente)   |");
        System.out.println("|  5  | Ordernar por nome (decrescente) |");
        System.out.println("|  6  | Sair                            |");
        System.out.println("|_______________________________________|");
        System.out.print("\033[34;7mDigite a opção desejada:\033[m ");
    }

    private static boolean navegacao(int escolhaMenu){
        switch (escolhaMenu) {
            case 1 -> Produto.listAll();
            //case 2 -> InicioCliente.iniciar();
            //case 3 -> InicioAdministrador.iniciar();
            //case 4 -> Login.login();
            //case 5 -> Login.login();
            case 6 -> { return false; }
        }
        return true;
    }
}
