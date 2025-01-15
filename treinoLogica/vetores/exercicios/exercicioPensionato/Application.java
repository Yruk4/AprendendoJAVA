package exercicios.exercicioPensionato;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locatarios[] vetor = new Locatarios[9];

        System.out.println("Informe quantos quartos seram alugados: ");
        int quantidadeDeQuartos = sc.nextInt();

        for (int i = 0; i < quantidadeDeQuartos; i++) {
            System.out.print("Informe o número do quarto: ");
            int numeroDoQuarto = sc.nextInt();
            System.out.print("Informe o nome do Locatário: ");
            String nome = sc.next();
            System.out.print("Informe o email do Locatário: ");
            String email = sc.next();
            vetor[numeroDoQuarto] = new Locatarios(nome, email, numeroDoQuarto);
        }

        for (int i = 0; i < 9; i++) {
            if (vetor[i] != null) {
                System.out.println(vetor[i].getQuarto() + ": " + vetor[i].getNome() + ", " + vetor[i].getEmail());
            }
        }


    }
}
