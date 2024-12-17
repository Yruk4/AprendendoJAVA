import java.util.Scanner;

public class exercicio3While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int x = 0;

         while ( x != 4) {

             System.out.println("Informe o numero. ");
             x = sc.nextInt();

            if (x == 1) {
                alcool += 1;
            } else if (x == 2) {
                gasolina += 1;
            } else if (x == 3) {
                diesel += 1;
            } else if ( x != 4 ){
                System.out.println("digite um número válido.");

            }
        }


         if ( x == 4 ) {
             System.out.println("Muito obrigado!");
             System.out.println("Alcool: " + alcool);
             System.out.println("Gasolina: " + gasolina);
             System.out.println("Diesel: " + diesel);
         }
        sc.close();
    }

}

