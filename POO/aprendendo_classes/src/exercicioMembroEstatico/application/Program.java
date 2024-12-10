package POO.aprendendo_classes.src.exercicioMembroEstatico.application;

import POO.aprendendo_classes.src.exercicioMembroEstatico.entidade.Conversor;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Qual o valor atual do dolar?");
        double valor = sc.nextDouble();

        System.out.println("Quanto você quer comprar?");
        double quantidade = sc.nextDouble();

        System.out.printf("Valor pago em reais: %.2f%n", Conversor.converte(valor,quantidade));

    }
}
