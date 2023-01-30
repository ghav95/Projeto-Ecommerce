import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Setter
@Getter
public class Produto implements Comparable<Produto> {
    private List<Produto> listaProdutos = new ArrayList<Produto>();
    private int idProduto;
    private String nome;
    private Double preco;
    private Enum<Categoria> categoria;
    private String marca;

    public Produto(int idProduto, String nome, double preco, Enum<Categoria> categoria, String marca) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
    }
    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void editarProduto(Produto produto) {
        int posicao = listaProdutos.indexOf(produto);
        listaProdutos.set(posicao, produto);
    }

    public List<Produto> visualizarProduto(){
        return listaProdutos;
    }

    public void removerProduto(Produto produto) {
        listaProdutos.remove(produto);
    }

    public List<Produto> filtrarPorCategoria(List<Produto> listaProdutos, Enum categoria){
        List<Produto> filtraProduto = new ArrayList<Produto>();
        for (Produto produto: listaProdutos) {
            if(produto.getCategoria().equals(categoria)){
                filtraProduto.add(produto);
            }
        }
        return filtraProduto;
    }
    public List<Produto> filtrarPorMarca(List<Produto> listaProdutos, String marca){
        List<Produto> filtraProdutoMarca = new ArrayList<Produto>();
        for (Produto produto: listaProdutos) {
            if(produto.getMarca().equals(marca)){
                filtraProdutoMarca.add(produto);
            }
        }
        return filtraProdutoMarca;
    }

    public List<Produto> ordenarPreco(List<Produto> listaProdutos, Double preco) {

       Collections.sort(listaProdutos);
       return listaProdutos;
    }

    @Override
    public int compareTo(Produto produto) {
        if(this.preco > produto.preco){
            return -1;
        }else if(this.preco == produto.preco){
            return 0;
        }else {
            return -1;
        }
    }
}
