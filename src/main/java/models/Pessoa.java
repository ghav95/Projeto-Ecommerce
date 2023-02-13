package models;

public interface Pessoa<T>{
     int id = 0;
     String nome = null;
     String login= null;
     String senha = null;
     String email = null;
     String cpfcnpj = null;

    T getById(int id);

    T getByCpf(String cpfcnpj);

    T getByLogin(String login);

}
