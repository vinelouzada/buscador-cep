package org.vinelouzada.service;

import com.google.gson.Gson;
import org.vinelouzada.dto.EnderecoDto;
import org.vinelouzada.json.EnderecoJsonConverter;
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
            return EnderecoJsonConverter.converter(json);
        }catch (IOException | InterruptedException ex){
            return ex.getMessage();
        }
    }

}
