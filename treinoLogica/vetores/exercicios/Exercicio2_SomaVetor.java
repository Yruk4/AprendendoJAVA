package treinoLogica.vetores.exercicios;

import java.util.Scanner;

    /*
    Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
   - Imprimir todos os elementos do vetor
   - Mostrar na tela a soma e a média dos elementos do vetor
     */

public class Exercicio2_SomaVetor {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int posicao = 1;
        int soma = 0;

        System.out.println("Quantos números você quer inserir?");
        int numeros = sc.nextInt();
        int[] vetor = new int[numeros];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o °%d número:  ", posicao);
            posicao++;
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }


        System.out.println("Valores inseridos:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d,  ", vetor[i]);
        }
        System.out.println("   ");
        System.out.println("A soma dos números inteiros é: " + soma);
        System.out.println("A média dos números inteiros é: " + soma / numeros);


    }
}

