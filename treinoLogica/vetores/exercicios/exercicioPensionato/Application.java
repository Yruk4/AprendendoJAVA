package treinoLogica.vetores.exercicios.exercicioPensionato;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locatario[] vetor = new Locatario[10];

        System.out.println("Informe quantos quartos seram alugados (1 a 10).");
        int quantidadeDeQuartos = sc.nextInt();
        while (quantidadeDeQuartos < 1 || quantidadeDeQuartos > 10) {
            System.out.println("Digite um número válido. De 1 a 10.");
            System.out.print("Informe a quantidade de quartos: ");
            quantidadeDeQuartos = sc.nextInt();
        }
        for (int i = 0; i < quantidadeDeQuartos; i++) {
            System.out.print("Informe o número do quarto (1 a 10): ");
            int numeroDoQuarto = sc.nextInt();
            while (numeroDoQuarto < 1 || numeroDoQuarto > 10 || vetor[numeroDoQuarto - 1] != null) {
                if (vetor[numeroDoQuarto - 1] != null) {
                    System.out.println("Esse quarto já está ocupado. Escolha outro.");
                }else{
                    System.out.println("Número inválido. Digite um número entre 1 e 10.");
                }
                System.out.print("Informe o número do quarto: ");
                numeroDoQuarto = sc.nextInt();
            }
            System.out.print("Informe o Nome do Locatário: ");
            String nome = sc.next();
            while (nome == null || !nome.matches("[a-zA-Z\\s]+")) {
                System.out.println("Nome inválido. Digite novamente:");
                nome = sc.next();
            }
            System.out.print("Informe o Email do Locatário: ");
            String email = sc.next();
            while (email == null || !email.matches("[a-zA-Z\\s@_\\-.]+")) {
                System.out.println("Email inválido. Digite novamente:");
                email = sc.next();

            }
            vetor[numeroDoQuarto - 1] = new Locatario(nome, email, numeroDoQuarto);
        }

        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(vetor[i].getQuarto() + ": " + vetor[i].getNome() + ", " + vetor[i].getEmail());
            }
            sc.close();
        }


    }
}

