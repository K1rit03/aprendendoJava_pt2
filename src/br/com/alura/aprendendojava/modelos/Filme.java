package br.com.alura.aprendendojava.modelos;

public class Filme {
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPLano;
    private double somaAvaliacao;
    private  int totalDeAvaliacoes;
    int duracaoEmMinutos;


    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
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
