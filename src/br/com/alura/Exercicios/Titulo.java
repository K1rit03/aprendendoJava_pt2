package br.com.alura.Exercicios;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outro) {
        return this.getNome().compareTo(outro.getNome());
    }

    public String toString() {
        return this.nome; //
    }
}
