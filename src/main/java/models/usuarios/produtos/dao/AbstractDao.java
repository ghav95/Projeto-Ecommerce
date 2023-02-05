package models.usuarios.produtos.dao;

import models.usuarios.produtos.Informatica;
import models.usuarios.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class AbstractDao<T, K> implements Dao<T, K>{

    @Override
    public T create(T objectDao) {
        return null;
    }

    @Override
    public T findById(K id) {
        return null;
    }

    @Override
    public void update(T objectDao) {

    }

    @Override
    public boolean delete(K id) {
        return false;
    }

}