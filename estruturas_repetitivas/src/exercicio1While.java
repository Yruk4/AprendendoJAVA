import java.util.Scanner;

public class exercicio1While {

    public static void main(String[] args) {


        System.out.println("Digite a senha: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        while ( x != 2002) {

            System.out.println("Senha invalida.");
            x = sc.nextInt();

        }

        System.out.println("Acesso permitido.");

        sc.close();
        }
    }

