package br.com.alura.Principal;

import br.com.alura.aprendendojava.modelos.Titulo;
import br.com.alura.aprendendojava.modelos.TituloOmdb;
import br.com.alura.exceptions.ErroDeConversaoDeAnoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca:");
        var buscar = leitura.nextLine();
        String buscarEncoded = URLEncoder.encode(buscar, StandardCharsets.UTF_8);
        String endereco =  "https://www.omdbapi.com/?t=" + buscarEncoded + "&apikey=a215246d";
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            String json = response.body();
            System.out.println(json);
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
//
            TituloOmdb meuTituloOmdb = gson.fromJson(json,TituloOmdb.class);
            System.out.println(meuTituloOmdb);


            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo ja convertido");
            System.out.println(meuTitulo);

            FileWriter escrita = new FileWriter("Filmes.txt");
            escrita.write(meuTitulo.toString());
            escrita.close();
        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Algum erro de argumento na busca,verifique o endereço");
        }catch (ErroDeConversaoDeAnoException e){
            System.out.println(e.getMessage());
        }
        System.out.println("O programa finalizou corretamente");

    }
}
