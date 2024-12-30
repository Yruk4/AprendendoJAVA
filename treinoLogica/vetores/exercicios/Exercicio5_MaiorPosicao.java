package exercicios;

import java.util.Scanner;

public class Exercicio5_MaiorPosicao {

    public static void main(String[] args) {

        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida,
        mostrar na tela
        o maior número do vetor (supor não haver empates).
        Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).
         */

        Scanner sc = new Scanner(System.in);
        int posicao = 1;

        System.out.print("Quantos números vai inserir? ");
        int num = sc.nextInt();
        int[] vect = new int[num];
        int max = vect[0];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Insira a quantidade do °%d numero:", posicao);
            vect[i] = sc.nextInt();
            posicao++;
        }

        posicao = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > max) {
                max = vect[i];
                posicao = i;
            }
        }

        System.out.println("Maior número: " + max);
        System.out.println("Posição: " + posicao);
        sc.close();
    }
}
