import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

    /*
    Leia um número do usuário e verifique:
    Se é divisível por 5 e 3;
    Se é divisível apenas por 5;
    Se é divisível apenas por 3;
    Caso contrário, exiba "Não é divisível por 5 ou 3".
    */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num % 3 == 0 && num % 5 == 0 ) {
            System.out.println("O número é divisivel por 5 e 3.");
        } else if (num % 3 == 0) {
            System.out.println("O número é divisivel por 3.");
        } else if (num % 5 == 0) {
            System.out.println("O número é divisivel por 5");
        }else {
            System.out.println("o número não é divisivel nem por 5 nem 3.");
        }

    }
}