package org.vinelouzada;

import org.vinelouzada.model.Cep;
import org.vinelouzada.repository.CepRepositoryInterface;
import org.vinelouzada.repository.ViaCepRepository;
import org.vinelouzada.service.CepService;
import org.vinelouzada.service.EscritorService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu CEP: ");
        String cepInput = leitura.nextLine();

        Cep cep = new Cep(cepInput);

        CepRepositoryInterface cepRepository = new ViaCepRepository();
        CepService service = new CepService(cepRepository);

        String endereco = service.buscarEndereco(cep);

        EscritorService escritorService = new EscritorService();
        escritorService.criar(endereco);

        System.out.println(endereco);
    }
}