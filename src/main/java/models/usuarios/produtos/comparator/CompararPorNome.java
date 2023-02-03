package models.usuarios.produtos.comparator;

import models.usuarios.produtos.Produto;

import java.util.Comparator;

public class CompararPorNome implements Comparator<Produto> {
    @Override
    public int compare(Produto produto1, Produto produto2) {
        return produto1.getNome().compareToIgnoreCase(produto2.getNome());
    }
}
