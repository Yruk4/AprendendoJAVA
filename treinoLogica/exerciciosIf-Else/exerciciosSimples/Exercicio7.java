import java.util.Scanner;

public class Exercicio7 {

   /*
   Escreva um programa que peça uma senha ao usuário.
   Se a senha for "1234", exiba "Acesso permitido"; caso contrário, "Acesso negado".
   */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        int senha = sc.nextInt();

        if(senha == 1234) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }
    }

}
