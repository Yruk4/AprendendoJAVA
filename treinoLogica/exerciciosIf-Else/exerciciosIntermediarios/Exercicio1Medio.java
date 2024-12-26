import java.util.Scanner;

public class Exercicio1Medio {

    public static void main(String[] args) {

        /*
        Crie um programa que leia dois números e uma operação matemática (+, -, *, /).
        Realize a operação escolhida e exiba o resultado. Caso a operação seja inválida, exiba uma mensagem de erro.
        */


        Scanner sc = new Scanner(System.in);

        System.out.println("Insira dois números inteiros.");
        System.out.print("Insira o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Insira o segundo número: ");
        double num2 = sc.nextDouble();
        double resultado = 0;
        System.out.println("Insira a operação mátematica: (+, -, *, /)");
        String operacao = sc.next();

        if(operacao.equals("+")){
            System.out.println("Selecionado adição.");
            resultado = num1 + num2;
        } else if(operacao.equals("-")){
            System.out.println("Selecionado subtração.");
            resultado = num1 - num2;
        } else if(operacao.equals("*")){
            System.out.println("Selecionado multiplicação.");
            resultado = num1 * num2;
        } else if(operacao.equals("/")){
            System.out.println("Selecionado divisão.");
            resultado = num1 / num2;
        } else{
            System.out.println("Digite uma operação válida.");
        }


        System.out.printf("Resultado da operação: %.2f", resultado);


    }

}
