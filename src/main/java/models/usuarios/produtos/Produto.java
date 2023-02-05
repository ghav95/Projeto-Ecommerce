package models.usuarios.produtos;

import lombok.Getter;
import lombok.Setter;
import models.usuarios.CadastrarProduto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

@Setter
@Getter
public class Produto implements Comparable<Produto>{
    private static int sequencia = 1;
    private int idProduto;
    private String nome;
    private Double preco;
    private String categoria;
    private String marca;

    private static List<Produto> listaProdutos = new ArrayList<>();

    public Produto(String nome, Double preco, String categoria, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
        this.idProduto = sequencia++;
        listaProdutos.add(this);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int compareTo(Produto produto) {
       return produto.getNome().compareToIgnoreCase(produto.getNome());
    }

    public static void listAll(){
        for(Produto p : listaProdutos){
            System.out.println(p.toString());
        }
    }

    public static void remove(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o id do produto que deseja remover: ");
        listaProdutos.remove(sc.nextInt());
    }

    public static void editar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o id do produto que deseja editar: ");
        listaProdutos.remove(sc.nextInt());
        CadastrarProduto.cadastrar();
    }

}
