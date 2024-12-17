import java.util.Scanner;

public class Exercicio2 {

    /*
    2. Par ou Ímpar
    Escreva um programa que leia um número inteiro e determine se ele é par ou ímpar.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número a ser verificado: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Seu número é par.");
        } else {
            System.out.println("Seu número é impar.");
        }

    }
}
