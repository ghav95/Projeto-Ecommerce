package dao;

import models.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

    private static List<Produto> produtos = new ArrayList<>();

    private boolean salvarProduto(Produto produto){
        return produtos.add(produto);
    }

}
