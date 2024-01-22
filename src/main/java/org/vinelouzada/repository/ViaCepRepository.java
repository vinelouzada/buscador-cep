package org.vinelouzada.repository;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepRepository implements CepRepositoryInterface{

    private final String api = "https://viacep.com.br/ws/";

    @Override
    public String buscar(String cep) throws IOException, InterruptedException {
        String url = api + cep + "/json";
        return this.requisicaoApi(url);
    }

    private String requisicaoApi(String url) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

}
