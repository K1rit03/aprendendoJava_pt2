public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPLano;
    double somaAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void minhaFichaTecnica(){

        System.out.println("nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        System.out.println("Duração do filme:" + duracaoEmMinutos);


    }
    void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    double mediaAvaliacao(){
        return somaAvaliacao / totalDeAvaliacoes;
    }
}
