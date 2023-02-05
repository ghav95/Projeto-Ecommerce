package models.usuarios;

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
        System.out.println("------------------------------------------");
        System.out.println("|  #  |     SERVIÇOS DISPONÍVEIS         |");
        System.out.println("------------------------------------------");
        System.out.println("|  1  | Listar Produtos                  |");
        System.out.println("|  2  | Filtrar por categoria            |");
        System.out.println("|  3  | Filtrar por marca                |");
        System.out.println("|  4  | Ordernar por nome (crescente)    |");
        System.out.println("|  5  | Ordernar por nome (decrescente)  |");
        System.out.println("|  6  | Ordernar por preco (crescente)   |");
        System.out.println("|  7  | Ordernar por preco (decrescente) |");
        System.out.println("|  8  | Sair                             |");
        System.out.println("|________________________________________|");
        System.out.print("\033[34;7mDigite a opção desejada:\033[m ");
    }

    private static boolean navegacao(int escolhaMenu){
        switch (escolhaMenu) {
            case 1 -> Produto.listAll();
            case 2 -> Produto.listAllFilterByCategoria();
            case 3 -> Produto.listAllFilterByMarca();
            case 4 -> Produto.listAllFilterByNameAsc();
            case 5 -> Produto.listAllFilterByNameDesc();
            case 6 -> Produto.listAllFilterByPrecoAsc();
            case 7 -> Produto.listAllFilterByPrecoDesc();
            case 8 -> {
                Login.login();
                return false;
            }
        }
        return true;
    }
}
