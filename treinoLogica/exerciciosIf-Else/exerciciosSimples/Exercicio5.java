import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        /* Solicite a idade do usuário. Se a idade for maior ou igual a 18,
           exiba "Pode votar"; caso contrário, exiba "Não pode votar".
         */


        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar.");
        }


    }

}
