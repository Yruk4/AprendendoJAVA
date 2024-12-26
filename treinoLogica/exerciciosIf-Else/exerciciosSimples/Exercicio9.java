import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        /*
        Peça ao usuário para inserir os três lados de um triângulo e verifique:
        Se os lados formam um triângulo equilátero (todos os lados iguais);
        Se formam um triângulo isósceles (dois lados iguais);
        Ou um triângulo escaleno (todos os lados diferentes).
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor dos 3 lados do triangulo: ");
        int ladoA = sc.nextInt();
        int ladoB = sc.nextInt();
        int ladoC = sc.nextInt();

        if(ladoA == ladoB && ladoC == ladoA) {
            System.out.println("Triangulo Equilátero");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
            System.out.println("Triangulo Isósceles");
        } else {
            System.out.println("Triangulo Escaleno");
        }

        sc.close();

    }

}
