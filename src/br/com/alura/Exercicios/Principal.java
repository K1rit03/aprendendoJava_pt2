package br.com.alura.Exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
//        Banco conta1 = new Banco(2586,3000);
//        Banco conta2 = new Banco(2587,6600);
//        Banco conta3 = new Banco(2588,10000);
//        Banco conta4 = new Banco(2589,286);
//
//        ArrayList<Banco> listaBancaria =  new ArrayList<>();
//        listaBancaria.add(conta1);
//        listaBancaria.add(conta2);
//        listaBancaria.add(conta3);
//        listaBancaria.add(conta4);
//
//        Banco menorItem = listaBancaria.get(0);
//
//        for (int i = 0; i < listaBancaria.size() ; i++) {
//            if(listaBancaria.get(i).getSaldo() < menorItem.getSaldo()){
//                menorItem = listaBancaria.get(i);
//            }
//
//        }
//        System.out.println("A conta com o menor saldo é: ");
//        System.out.println("Número da Conta: " + menorItem.getNumeroConta());
//        System.out.println("Saldo: R$ " + menorItem.getSaldo());


        var produto1 = new Produto("videogame",5000);
        var produto2 = new Produto("casaco",300);
        var produto3 = new Produto("frutas",10);


        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);


        int precoTotal = 0;

        for (int i = 0; i < listaProdutos.size(); i++) {
            precoTotal += (int)listaProdutos.get(i).getPreco();

        }

        System.out.println("Media dos produtos:" + precoTotal/listaProdutos.size());

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(20);
        lista2.add(350);
        lista2.add(7);
        lista2.add(2);
        lista2.add(630);
        lista2.add(69);

        Collections.sort(lista2);
        System.out.println(lista2);


        ArrayList<Titulo> listaExercicio2 = new ArrayList<>();
        Titulo titulo1 = new Titulo("Alberto");
        Titulo titulo2 = new Titulo("Thiago");
        Titulo titulo3 = new Titulo("Zaki");
        Titulo titulo4 = new Titulo("Beto");
        Titulo titulo5 = new Titulo("Antonio");
        listaExercicio2.add(titulo1);
        listaExercicio2.add(titulo2);
        listaExercicio2.add(titulo3);
        listaExercicio2.add(titulo4);
        listaExercicio2.add(titulo5);
        Collections.sort(listaExercicio2);
        System.out.println(listaExercicio2);


    }
}
