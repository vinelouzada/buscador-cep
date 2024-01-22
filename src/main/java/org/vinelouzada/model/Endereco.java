package org.vinelouzada.model;

import org.vinelouzada.dto.EnderecoDto;

public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String complemento;
    private String uf;
    private String ddd;

    public Endereco(EnderecoDto dto){
        this.cep = dto.cep();
        this.logradouro = dto.logradouro();
        this.bairro = dto.bairro();
        this.localidade = dto.localidade();
        this.complemento = dto.complemento();
        this.uf = dto.uf();
        this.ddd = dto.ddd();
    }

    public String cep(){
        return this.cep;
    }

    public String logradouro(){
        return this.logradouro;
    }

    public String bairro(){
        return this.bairro;
    }

    public String localidade(){
        return this.localidade;
    }

    public String complemento(){
        return this.complemento;
    }

    public String uf(){
        return this.uf;
    }

    public String ddd(){
        return this.ddd;
    }

    @Override
    public String toString() {
        return String.format("Endereco{cep='%s', logradouro='%s', bairro='%s', localidade='%s', complemento='%s', uf='%s', ddd='%s'}",
                cep, logradouro, bairro, localidade, complemento, uf, ddd);
    }
}
