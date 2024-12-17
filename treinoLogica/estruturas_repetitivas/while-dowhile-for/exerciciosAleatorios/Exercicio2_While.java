import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_While {

        /*2 - Escreva um programa que leia uma quantidade indefinida de notas de alunos
        (valores entre 0 e 10). O programa deve parar quando uma nota inválida
        (menor que 0 ou maior que 10) for inserida.
        Ao final, exiba a média das notas válidas inseridas.
         */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int nota = 0;
        double valFinal = 0;
        int soma = 0;
        int num = 0;


        while(nota >= 0 && nota <= 10){

            System.out.println("Digite uma nota. ( valor fora de 0-10 para sair) ");
            nota = sc.nextInt();
            if ( nota >=0 && nota <= 10) {
                soma += nota;
                num++;
            }
        }
        valFinal = soma / num;
        System.out.printf("a Media dos alunos é: %.1f %n", valFinal);

}

}
