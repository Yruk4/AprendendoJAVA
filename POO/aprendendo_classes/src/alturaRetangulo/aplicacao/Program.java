package POO.aprendendo_classes.src.alturaRetangulo.aplicacao;

import POO.aprendendo_classes.src.alturaRetangulo.entidade.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        Retangulo valorRetangulo = new Retangulo();

        System.out.println("Insira o valor de largura: ");
        valorRetangulo.largura = sc.nextDouble();
        System.out.println("Insira o valor de altura: ");
        valorRetangulo.altura = sc.nextDouble();

        System.out.println(valorRetangulo);








    }
}
