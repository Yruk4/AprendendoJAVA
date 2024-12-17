import java.util.Scanner;

public class Exercicio1 {

    /*
    1. Número Positivo ou Negativo
    Escreva um programa que peça ao usuário para inserir um número.
    O programa deve verificar se o número é positivo, negativo ou zero.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número a ser verificado: ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("Esse número é negativo.");
        } else if (num == 0) {
            System.out.println("Esse número tem o valor zero.");
        } else {
            System.out.println("Esse número é positivo.");
        }

    }
}
