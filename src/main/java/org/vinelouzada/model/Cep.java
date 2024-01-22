package org.vinelouzada.model;

public class Cep {

    private String numero;

    public Cep (String cep){

        if(!cep.matches("^\\d{8}$")){
            throw new IllegalArgumentException("Cep inválido");
        }

        this.numero = cep;
    }

    public String numero(){
        return this.numero;
    }
}
