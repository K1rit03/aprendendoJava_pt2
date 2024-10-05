public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPLano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void minhaFichaTecnica(){

        System.out.println("nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        System.out.println("Duração do filme:" + duracaoEmMinutos);


    }
}
