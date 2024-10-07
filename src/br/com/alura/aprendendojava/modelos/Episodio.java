package br.com.alura.aprendendojava.modelos;

import br.com.alura.aprendendojavacalculo.modelos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisu;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisu() {
        return totalVisu;
    }

    public void setTotalVisu(int totalVisu) {
        this.totalVisu = totalVisu;
    }

    @Override
    public int getClassificacao() {
        if (totalVisu > 100){
            return 4;
        }else{
            return 2;
        }
    }
}
