public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "ScarFace";
        filme1.anoDeLancamento = 1984;
        filme1.duracaoEmMinutos = 170;

        filme1.minhaFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(10);
        filme1.avalia(7);
        filme1.avalia(2);
        System.out.println(filme1.somaAvaliacao);
        System.out.println(filme1.totalDeAvaliacoes);
        System.out.println(filme1.mediaAvaliacao());

    }
}
