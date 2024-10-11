package br.com.alura.aprendendojava.modelos;

import br.com.alura.exceptions.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    private String nome;

    private int anoDeLancamento;
    private boolean incluidoNoPLano;
    private double somaAvaliacao;
    private  int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não foi possivel converter o ano por conta da quantidade de caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }


    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPLano() {
        return incluidoNoPLano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPLano(boolean incluidoNoPLano) {
        this.incluidoNoPLano = incluidoNoPLano;
    }

    public void minhaFichaTecnica(){

        System.out.println("nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        System.out.println("Duração do filme:" + duracaoEmMinutos);


    }
    public void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double mediaAvaliacao(){
        return somaAvaliacao / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento + "," +
                "duração" + duracaoEmMinutos;

    }
}
