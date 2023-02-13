package models.produtos;

import lombok.Getter;
import lombok.Setter;
import services.comparator.CompararPorNome;
import services.comparator.CompararPorPreco;
import services.CadastrarProduto;

import java.util.*;

@Setter
@Getter
public class Produto implements Comparable<Produto>{
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
        listaProdutos.add(this);
        this.idProduto = listaProdutos.indexOf(this);
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
        if(listaProdutos.size() == 0) System.out.println("Não há produtos cadastrados!");
        for(Produto p : listaProdutos){
            System.out.println(p.toString());
        }
    }

    public static void listAllFilterByMarca(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a marca: ");
        String marca = sc.next();
        if(listaProdutos.size() == 0) System.out.println("Não há produtos cadastrados!");
        for(Produto p : listaProdutos){
            if(p.marca.equals(marca)) System.out.println(p.toString());
        }
    }

    public static void listAllFilterByCategoria(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a marca: ");
        String marca = sc.next();
        if(listaProdutos.size() == 0) System.out.println("Não há produtos cadastrados!");
        for(Produto p : listaProdutos){
            if(p.categoria.equals(marca)) System.out.println(p.toString());
        }
    }

    /*public static void listAllByNameDesc(){
        listaProdutos.sort((o1, o2) -> );
    }*/

    public static void remove(){
        Scanner sc = new Scanner(System.in);
        int id;
        listAll();
        System.out.println("Digite o id do produto que deseja remover: ");
        id = sc.nextInt();
        listaProdutos.removeIf(p -> p.getIdProduto() == id);
    }

    public static void editar(){
        Scanner sc = new Scanner(System.in);
        int id;
        listAll();
        System.out.print("Digite o id do produto que deseja editar: ");
        id = sc.nextInt();
        listaProdutos.removeIf(p -> p.getIdProduto() == id);
        CadastrarProduto.cadastrar();
    }

    public static void listAllFilterByNameAsc(){
        listaProdutos.sort(new CompararPorNome());
        listAll();
    }

    public static void listAllFilterByNameDesc(){
        listaProdutos.sort(new CompararPorNome());
        Collections.reverse(listaProdutos);
        listAll();
    }

    public static void listAllFilterByPrecoAsc(){
        listaProdutos.sort(new CompararPorPreco());
        listAll();
    }

    public static void listAllFilterByPrecoDesc(){
        listaProdutos.sort(new CompararPorPreco());
        Collections.reverse(listaProdutos);
        listAll();
    }

}
