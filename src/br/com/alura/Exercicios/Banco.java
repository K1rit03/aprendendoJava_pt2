package br.com.alura.Exercicios;

public class Banco {
    private int numeroConta;
    private double saldo;


    public Banco(int numeroConta,double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }



    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
