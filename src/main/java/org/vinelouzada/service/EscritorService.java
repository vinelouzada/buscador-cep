package org.vinelouzada.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class EscritorService {

    public final String caminho = System.getProperty("user.dir") + "/src/main/resources/storage/txt/";

    public void criar(String dados) {

        String caminhoDoArquivo = caminho + UUID.randomUUID() + ".txt";

        try{
            FileWriter writer = new FileWriter(caminhoDoArquivo);
            writer.write(dados);
            writer.close();
        } catch (IOException e) {
            System.out.println("Ocorrou um erro ao salvar o arquivo: " + e.getMessage());
        }

    }
}
