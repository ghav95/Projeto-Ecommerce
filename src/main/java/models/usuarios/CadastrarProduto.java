package models.usuarios;

import models.usuarios.produtos.Produto;

import java.util.Scanner;

public class CadastrarProduto {

    public static void cadastrar(){
        String nome, categoria, marca;
        double preco;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do Produto: ");
        nome = sc.next();
        System.out.print("Digite o preço do Produto: ");
        preco = sc.nextDouble();
        System.out.print("Digite a categoria do Produto: ");
        categoria = sc.next();
        System.out.print("Digite a marca do Produto: ");
        marca = sc.next();

        new Produto(nome, preco, categoria, marca);

        System.out.println("\033[32mProduto cadastrado com sucesso!\033[m");
    }

}
