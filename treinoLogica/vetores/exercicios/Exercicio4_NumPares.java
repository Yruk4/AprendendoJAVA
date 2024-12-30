package exercicios;

import java.util.Scanner;

public class Exercicio4_NumPares {

    public static void main(String[] args) {

        /*
         Faça um programa que leia N números inteiros e armazene-os em um vetor.
         Em seguida, mostre na tela todos os números pares, e também a quantidade de
         números pares.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de números inteiros: ");
        int num = sc.nextInt();

        int posicao = 1;
        int quantidade = 0;

        int[] vetor = new int[num];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o °%d número: ", posicao);
            vetor[i] = sc.nextInt();
            posicao++;
        }

        System.out.println("Os números pares são: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        for (int i=0; i< vetor.length; i++){
            if (vetor[i] % 2 == 0){
                quantidade ++;
            }
        }
        System.out.println(" ");
        System.out.println("Quantidade de pares = " + quantidade);

    }
}

