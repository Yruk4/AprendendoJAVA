package treinoLogica.vetores.exercicios;

import java.util.Scanner;

public class Exercicio1_Negativos {

    /*
    Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
    e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos números você quer inserir? (1 a 10)");
        int quantidadeNumeros = sc.nextInt();
        while (quantidadeNumeros > 10) {
            System.out.println("Por favor, digite novamente um número válido. (1 a 10) ");
            quantidadeNumeros = sc.nextInt();
        }
        int[] vect = new int[quantidadeNumeros];

        for (int i = 0; i < vect.length; i++) {

            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }


        System.out.println("Números negativos: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

    }

}
