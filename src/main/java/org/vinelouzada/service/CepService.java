package org.vinelouzada.service;

import com.google.gson.Gson;
import org.vinelouzada.dto.EnderecoDto;
import org.vinelouzada.model.Cep;
import org.vinelouzada.model.Endereco;
import org.vinelouzada.repository.CepRepositoryInterface;

import java.io.IOException;

public class CepService {

    private CepRepositoryInterface repository;

    public CepService(CepRepositoryInterface repository){
        this.repository = repository;
    }

    public String buscarEndereco(Cep cep){
        try {
            String json = repository.buscar(cep.numero());
            return this.jsonParaEndereco(json);
        }catch (IOException | InterruptedException ex){
            return ex.getMessage();
        }
    }

    private String jsonParaEndereco(String json){
        Gson gson = new Gson();
        EnderecoDto dto = gson.fromJson(json, EnderecoDto.class);
        return new Endereco(dto).toString();
    }

}
