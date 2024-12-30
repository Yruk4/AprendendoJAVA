package exercicios;

import java.util.Scanner;

public class Exercicio6_SomaVetores {

    public static void main(String[] args) {

        /*
          Faça um programa para ler dois vetores A e B, contendo N elementos cada.
          Em seguida, gere um
          terceiro vetor C onde cada elemento de C é a soma dos elementos
          correspondentes A e B.
          Imprima o  vetor C gerado.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números vai inserir em cada vetor?");
        int num = sc.nextInt();
        int posicao = 1;

        int[] vect1 = new int[num];
        System.out.println("Digite os números do primeiro vetor:");
        for (int i=0; i< vect1.length; i++) {
            System.out.printf("°%d número: ", posicao);
            vect1[i] = sc.nextInt();
            posicao++;
        }

        System.out.println("___________________");
        posicao = 1;

        int[] vect2 = new int[num];
        System.out.println("Digite os números do segundo vetor:");
        for (int i=0; i< vect2.length; i++) {
            System.out.printf("°%d número: ", posicao);
            vect2[i] = sc.nextInt();
            posicao++;
        }
        posicao = 1;
        System.out.println("___________________");
        System.out.println("Soma de cada posição inserida: ");
        int[]vect3 = new int[num];
        for (int i=0; i< vect3.length; i++) {
            vect3[i] = vect1[i] + vect2[i];
            System.out.println("°" + posicao + " Posição = "+ vect3[i]);
            posicao++;
        }

    }
}
