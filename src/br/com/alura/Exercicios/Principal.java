package br.com.alura.Exercicios;

import java.util.ArrayList;

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




    }
}
