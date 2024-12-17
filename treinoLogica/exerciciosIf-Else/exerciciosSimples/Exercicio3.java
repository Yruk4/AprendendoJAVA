import java.util.Scanner;

public class Exercicio3 {
        /*
        3. Maior entre Dois Números
        Crie um programa que leia dois números e informe qual deles é o maior ou
        se eles são iguais.
         */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número informado é maior: " + num1);
        } else if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("O segundo número informado é maior: " + num2);
        }
    }
}
