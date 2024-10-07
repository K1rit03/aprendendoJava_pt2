package br.com.alura.aprendendojavacalculo.modelos;

import br.com.alura.aprendendojava.modelos.Filme;
import br.com.alura.aprendendojava.modelos.Serie;
import br.com.alura.aprendendojava.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

      public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
      }

}
