package br.com.alura.aprendendojava.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPLano;
    private double somaAvaliacao;
    private  int totalDeAvaliacoes;
    private int duracaoEmMinutos;


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
}
