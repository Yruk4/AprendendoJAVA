
import treinoLogica.vetores.exemploComClasse.entidade.Produto;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double soma = 0;

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPreco();
        }

        double resultado = soma / vect.length;
        System.out.printf("Média de preços: %.2f%n", resultado);
        sc.close();
    }

}
