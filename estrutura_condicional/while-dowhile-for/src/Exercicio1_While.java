import java.util.Scanner;

public class Exercicio1_While {

    /*1. Escreva um programa que peça ao usuário para inserir números inteiros.
    o programa deve somar todos os números positivos que o usuario inserir,
    e exibir o resultado final. o programa termina quando o usuario digitar
    um número negativo.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int num = 0;
        int quantFinal = 0;

        while ( num >= 0 ) {

            System.out.println("Digite um número. !!!Digite um número negativo para sair!!! .");
            num = sc.nextInt();
            quantFinal += num;
        }

        System.out.println("Soma dos números positivos: " + quantFinal);

    }
}
