package models.usuarios.produtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Produto<T extends Enum<?>> implements Comparable<Produto>{
    private static int sequencia = 1;
    private int idProduto;
    private String nome;
    private Double preco;
    private T categoria;
    private String marca;

    private List<T> listaProdutos = new ArrayList<>();

    public Produto(String nome, Double preco, T categoria, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
       this.idProduto = sequencia++;
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

}
