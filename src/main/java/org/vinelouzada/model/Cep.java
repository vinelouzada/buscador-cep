package org.vinelouzada.model;

public class Cep {

    private String cep;

    public Cep (String cep){

        if(!cep.matches("^\\d{8}$")){
            throw new IllegalArgumentException("Cep inválido");
        }

        this.cep = cep;
    }

    public String numero(){
        return this.cep;
    }
}
