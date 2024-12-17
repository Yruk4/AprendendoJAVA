package exercicio_banco2;

import java.util.Scanner;

public class application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        contaBancaria david = new contaBancaria();

        double saldo = david.getSaldo();


        System.out.println("Bem vindo!");
        System.out.println("Escolha entre as 3 opções para iniciar.");
        System.out.println("1 - Saque");
        System.out.println("2 - Deposito");
        System.out.println("3 - Ver saldo");
        int resposta = sc.nextInt();

        switch (resposta) {
            case 1:

                System.out.println("Insira o valor para sacar:");
                double sacar = sc.nextDouble();


                if (sacar > saldo) {
                    System.out.println("Saldo insuficiente.");
                    System.out.println("Saldo disponivel: R$" + david.getSaldo());
                } else {
                    david.sacar(sacar);
                    System.out.println("Saldo atualizado: R$" + david.getSaldo());
                    break;
                }
                break;
            case 2:
                System.out.println("Insira o valor para depositar:");
                david.depositar(sc.nextDouble());
                System.out.println("Saldo atualizado: R$" + david.getSaldo());
                break;
            case 3:
                System.out.println("Saldo disponivel: R$" + david.exibirSaldo());
                System.out.println();
                System.out.println();
                System.out.println("Deseja fazer outra operação?");
                System.out.println("1- Sim");
                System.out.println("2- Não");
                resposta = sc.nextInt();
                if (resposta == 1) {
                    switch (resposta) {
                        case 1:

                            System.out.println("Insira o valor para sacar:");
                            sacar = sc.nextDouble();


                            if (sacar > saldo) {
                                System.out.println("Saldo insuficiente.");
                                System.out.println("Saldo disponivel: R$" + david.getSaldo());
                            } else {
                                david.sacar(sacar);
                                System.out.println("Saldo atualizado: R$" + david.getSaldo());
                                break;
                            }
                            break;
                        case 2:
                            System.out.println("Insira o valor para depositar:");
                            david.depositar(sc.nextDouble());
                            System.out.println("Saldo atualizado: R$" + david.getSaldo());
                            break;
                        case 3:
                            System.out.println("Saldo disponivel: R$" + david.exibirSaldo());
                            System.out.println();
                            break;

                        default:
                while (resposta != 1 && resposta != 2 && resposta != 3) {

                    System.out.println("Digite uma das opções: ");
                    System.out.println("1º - Saque");
                    System.out.println("2º - Deposito");
                    System.out.println("3º - Ver saldo");
                    resposta = sc.nextInt();
                }
                switch (resposta) {
                    case 1:

                        System.out.println("Insira o valor para sacar:");
                        sacar = sc.nextDouble();


                        if (sacar > saldo) {
                            System.out.println("Saldo insuficiente.");
                            System.out.println("Saldo disponivel: R$" + david.getSaldo());

                        } else {
                            saldo -= sacar;
                            david.setSaldo(saldo);
                            System.out.println("Saldo atualizado: R$" + david.getSaldo());
                            break;
                        }

                        break;

                    case 2:

                        System.out.println("Insira o valor para depositar:");
                        david.depositar(sc.nextDouble());
                        System.out.println("Saldo atualizado: R$" + david.getSaldo());
                        break;

                    case 3:
                        System.out.println("Saldo disponivel: R$" + david.exibirSaldo());
                        break;


                }
        }
    }
}


