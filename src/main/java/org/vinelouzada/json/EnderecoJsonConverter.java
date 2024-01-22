package org.vinelouzada.json;

import com.google.gson.Gson;
import org.vinelouzada.dto.EnderecoDto;
import org.vinelouzada.model.Endereco;

public class EnderecoJsonConverter {

    public static String converter(String json){
        Gson gson = new Gson();
        EnderecoDto dto = gson.fromJson(json, EnderecoDto.class);
        return new Endereco(dto).toString();
    }
}
