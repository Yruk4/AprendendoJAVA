package treinoLogica.vetores.exercicios.exercicio3_Alturas.aplicação;

import treinoLogica.vetores.exercicios.exercicio3_Alturas.entidade.Pessoas;

import java.util.Scanner;

public class Exercicio3_Alturas {

   /* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
    tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
    bem como os nomes dessas pessoas caso houver.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int posicao = 1;
        double media = 0;
        int menores = 0;


        System.out.println("Insira o número de pessoas a serem cadastradas: ");
        int numeroPessoas = sc.nextInt();
        Pessoas[] vetor = new Pessoas[numeroPessoas];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Insira os dados da °%d pessoa.%n", posicao);
            System.out.println("Digite o nome: ");
            String nome = sc.next();
            System.out.println("Digite a idade:");
            int idade = sc.nextInt();
            System.out.println("Digite a altura:");
            double altura = sc.nextDouble();
            posicao++;
            vetor[i] = new Pessoas(nome, idade, altura);
        }

        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i].getAltura();
        }
        posicao = 1;
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Dados da °%d pessoa:%n", posicao);
            System.out.printf("Nome: %s%n", vetor[i].getNome());
            System.out.printf("Idade: %d%n", vetor[i].getIdade());
            System.out.printf("Altura: %.2f%n", vetor[i].getAltura());
            System.out.println("_________________________________________ ");
            posicao++;
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 18) {
                menores++;
            }
        }

        double percentualDeMenores = (double) menores *100 /numeroPessoas;

        System.out.printf("Altura Média: %.2f%n", media / numeroPessoas);
        System.out.printf("Porcentagem de pessoas com menos de 18 anos:  %.2f%% %n", percentualDeMenores);
        System.out.println("Nome das pessoas com menos de 18: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 18) {
                System.out.println(vetor[i].getNome());
            }
        }


    }

}
