import br.com.alura.aprendendojava.modelos.Filme;
import br.com.alura.aprendendojava.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("ScarFace");
        filme1.setAnoDeLancamento(1984);
        filme1.setDuracaoEmMinutos(170);
        System.out.println("Duração do filme:" + filme1.getDuracaoEmMinutos() );





        filme1.minhaFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(10);
        filme1.avalia(7);
        filme1.avalia(2);
        System.out.println(filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.mediaAvaliacao());

        Serie peakyblinders = new Serie();
        peakyblinders.setNome("Peaky Blinders");
        peakyblinders.setAnoDeLancamento(2013);
        peakyblinders.setTemporadas(6);
        peakyblinders.setEpisodiosPorTemporada(6);
        peakyblinders.setMinutosPorEpisodio(55);


        peakyblinders.minhaFichaTecnica();

        System.out.println("Duração do para maratonar Peaky Blinders:" + peakyblinders.getDuracaoEmMinutos() );

    }
}
