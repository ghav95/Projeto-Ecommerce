package models.produtos;

import lombok.Builder;

@Builder

public class Informatica extends Produto {
    private String serial;

    public Informatica(String nome, Double preco, String categoria, String marca, String serial) {
        super(nome, preco, categoria, marca);
        generateSerial(this);
    }

    private void generateSerial(Informatica informatica){
        this.serial = "pokpaodkdeapdak";
    }

}
