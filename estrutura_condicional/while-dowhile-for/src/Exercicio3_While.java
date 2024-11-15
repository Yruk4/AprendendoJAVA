import java.util.Scanner;

public class Exercicio3_While {

    /* 3- Escreva um programa que solicite ao usuário um número inteiro positivo.
     O programa deve, então, realizar uma contagem regressiva a partir desse número
     até 0, exibindo cada número no console. O programa deve exibir "FIM!"
     ao final da contagem
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numDigitado = sc.nextInt();
        int entrada = 0;
        int saida = numDigitado;

        while (entrada == 0 && saida != entrada) {

            saida -= 1;
            numDigitado -= 1;
            System.out.println(numDigitado);

        }

        System.out.println("FIM");

    }

}
