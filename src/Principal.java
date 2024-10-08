import br.com.alura.aprendendojava.modelos.Episodio;
import br.com.alura.aprendendojava.modelos.Filme;
import br.com.alura.aprendendojava.modelos.Serie;
import br.com.alura.aprendendojavacalculo.modelos.CalculadoraTempo;
import br.com.alura.aprendendojavacalculo.modelos.FiltroRecomencao;

import java.util.ArrayList;

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

        Filme filme2 = new Filme();
        filme2.setNome("Ted2");
        filme2.setAnoDeLancamento(2015);
        filme2.setDuracaoEmMinutos(116);




        CalculadoraTempo calc = new CalculadoraTempo();
        calc.inclui((filme1));
        calc.inclui((filme2));
        calc.inclui(peakyblinders);
        System.out.println(calc.getTempoTotal());

        FiltroRecomencao filtro = new FiltroRecomencao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(peakyblinders);
        episodio.setTotalVisu(300);
        filtro.filtra(episodio);

        var filme3 = new Filme();
        filme3.setNome("Django Livre");
        filme3.setAnoDeLancamento(2013);
        filme3.setDuracaoEmMinutos(165);
        filme3.avalia(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);

        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme:" + listaDeFilmes.get(0).getNome());

        System.out.println(listaDeFilmes);

    }
}
