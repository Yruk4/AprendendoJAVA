
package treinoLogica.vetores;

import java.util.Scanner;

public class exemplo {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < n; i++){
            soma += vect[i];
        }
        double resultado = soma / n;

        System.out.printf("Média de tamanho é: %.2f%n",resultado);

            sc.close();
    }

}
