package br.com.alura.Principal;

import br.com.alura.aprendendojava.modelos.Filme;
import br.com.alura.aprendendojava.modelos.Serie;
import br.com.alura.aprendendojava.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Scarface",1984);
        filme1.avalia(10);
        Filme filme2 = new Filme("Ted 2",2015);
        filme2.avalia(10);
        var filme3 = new Filme("Django Livre",2013);
        filme3.avalia(9);
        Serie peakyblinders = new Serie("Peaky blinders",2013);
        List<Titulo> lista = new LinkedList<>();

        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(peakyblinders);


        for (Titulo item: lista){

            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }


        }


        ArrayList<String> buscaArtista = new ArrayList<>();

        buscaArtista.add("Adam sandler");
        buscaArtista.add("Leornado dicaprio");
        buscaArtista.add("Brad Pitt");
        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);
        System.out.println("depois da ordenação: " + buscaArtista);
        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
