import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        /*
        Peça ao usuário para inserir três números e determine qual deles é o maior.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("o primeiro número informado é maior.");
        } else if ( num3 > num1 && num3 > num2){
            System.out.println(" o terceiro número informado é maior. ");
        }else {
            System.out.println("o segundo número informado é maior.");
        }

    }

}
