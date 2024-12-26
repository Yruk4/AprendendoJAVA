import java.util.Scanner;

public class Exercicio2Medio {

    public static void main(String[] args) {

        /*
        Peça ao usuário que insira um ano e verifique se ele é bissexto:
        Um ano é bissexto se for divisível por 4 e não divisível por 100,
        a menos que seja divisível por 400.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um ano: ");
        int anoInformado = sc.nextInt();

        if (anoInformado % 4 == 0 && anoInformado % 100 != 0) {
            System.out.println("o Ano selecionado é bissexto.");
        } else if(anoInformado % 4 == 0 && anoInformado % 100 != 0 && anoInformado % 400 == 0){
            System.out.println("o Ano selecionado é bissexto.");
        } else {
            System.out.println("o Ano selecionado não é bissexto.");
        }

    }



}
