package br.com.alura.aprendendojavacalculo.modelos;

import br.com.alura.aprendendojava.modelos.Titulo;

public class FiltroRecomencao {
    private String recomendacao;


    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os favoritos do momentos");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento");
        }else{
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}
