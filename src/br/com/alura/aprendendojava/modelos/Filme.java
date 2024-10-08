package br.com.alura.aprendendojava.modelos;

import br.com.alura.aprendendojavacalculo.modelos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    @Override
    public int getClassificacao(){
        return (int) mediaAvaliacao() / 2;
    }

    @Override
    public String toString() {
        return "Fime:" + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
