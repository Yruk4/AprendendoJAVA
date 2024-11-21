package exercicio_banco;

import java.util.Random;
import java.util.Scanner;


public class application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        double saldo = 0;

        System.out.println("Bem vindo! vamos criar sua conta!");
        System.out.println("Digite seu nome:");
        String nome = sc.next();

        int numConta = random.nextInt(10000) * 100;

        System.out.println("Você deseja adicionar um saldo inicial? s/n");
        String resposta = sc.next();
        if (resposta != "n" && resposta != "N") {
            System.out.println("Digite o valor a adicionar");
            saldo = sc.nextDouble();
        }
        Dados cliente = new Dados(numConta, nome, saldo);
        System.out.println("Conta criada com sucesso!");
        System.out.print("Nome: " + nome + "," + " ");
        System.out.println("conta: " + numConta);
        System.out.printf("Saldo atual: %.2f%n", cliente.getSaldo());
        System.out.println("Digite o valor para deposito:");

        cliente.adicionarSaldo(sc.nextDouble());

        System.out.print("Nome: " + nome + "," + " ");
        System.out.println("conta:" + numConta);
        System.out.printf("Saldo atual: R$%.2f%n", cliente.getSaldo());
        System.out.println("Digite o valor para saque:");
        System.out.println("(Cada saque tem uma taxa de R$5,00)");


        cliente.removerSaldo(sc.nextDouble());

        System.out.print("Nome: " + nome + "," + " ");
        System.out.println("conta: " + numConta);
        System.out.printf("Saldo atual: %.2f%n", cliente.getSaldo());

        sc.close();
    }
}
