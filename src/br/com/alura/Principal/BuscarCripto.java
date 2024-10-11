package br.com.alura.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscarCripto {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva aqui a criptomoeda desejável:");
        var nomeMoeda = leitura.nextLine();
        System.out.println("Agora fale de qual pais será a moeda que voce quer fazer o cambio:");
        var paisDinheiro = leitura.nextLine();

        String buscaCompleta = "https://api.coingecko.com/api/v3/simple/price?ids=" + nomeMoeda + "&vs_currencies=" + paisDinheiro;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(buscaCompleta))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
