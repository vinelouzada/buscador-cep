package org.vinelouzada.dto;

public record EnderecoDto(String cep,
                          String logradouro,
                          String complemento,
                          String bairro,
                          String localidade,
                          String uf,
                          String ddd
) {
}
