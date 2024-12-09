package exercicio_banco2;

import java.util.Scanner;

public class contaBancaria {


    Scanner sc = new Scanner(System.in);

    private int numeroConta;
    private double saldo;
    private String nomeTitular;

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

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double depositar(double valor) {
        this.saldo += valor;
        return this.saldo;
    }


    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

    public double exibirSaldo() {
        return this.saldo;
    }


}



