package models.usuarios;

import models.usuarios.produtos.Produto;

import java.util.Scanner;

public class CadastrarProduto {

    public static void cadastrar(){
        String nome, categoria, marca;
        double preco;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        nome = sc.next();
        System.out.print("Digite o preço: ");
        preco = sc.nextDouble();
        System.out.print("Digite a categoria: ");
        categoria = sc.next();
        System.out.print("Digite a marca: ");
        marca = sc.next();

        new Produto(nome, preco, categoria, marca);

        System.out.println("Produto cadastrado com sucesso!");
    }

}
