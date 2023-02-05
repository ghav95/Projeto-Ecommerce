package models.usuarios.produtos.comparator;

import java.util.Comparator;

public interface Comparar<T> {
     int compare(T o1, T o2);
}
