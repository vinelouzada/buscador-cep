package org.vinelouzada.repository;

import java.io.IOException;

public interface CepRepositoryInterface {
    public String buscar(String cep) throws IOException, InterruptedException;
}
