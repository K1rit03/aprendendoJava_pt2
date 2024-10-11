package br.com.alura.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class LivrosBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o livro que deseja buscar");
        var buscarLivro = leitura.nextLine();
        String buscarLivroCodificado = URLEncoder.encode(buscarLivro, StandardCharsets.UTF_8);
        String buscaCompleta = "https://www.googleapis.com/books/v1/volumes?q="+buscarLivroCodificado;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(buscaCompleta))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}
