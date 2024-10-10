package br.com.alura.Principal;

import java.util.ArrayList;

public class Exercicios {
    public static void main(String[] args) {
        ArrayList<String> listaExercicio = new ArrayList<>();
        listaExercicio.add("Thiago");
        listaExercicio.add("André");
        listaExercicio.add("Matheus");
        listaExercicio.add("João");
        listaExercicio.add("Lucas");

        for(String item: listaExercicio){
            System.out.println(item);
        }
    }
}
