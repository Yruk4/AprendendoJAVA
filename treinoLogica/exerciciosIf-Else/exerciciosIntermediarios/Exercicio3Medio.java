import java.util.Scanner;

public class Exercicio3Medio {

    public static void main(String[] args) {

        /*
        Crie um programa que peça ao usuário o número de quilômetros percorridos
        em uma viagem e calcule o preço da tarifa:
        Até 200 km: R$ 0,50 por km;
        Acima de 200 km: R$ 0,45 por km.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de quilômetros percorridos: ");
        double km = sc.nextDouble();
        double preco = 0;
        if(km <= 200){
            preco = km * 0.50;
        }else {
            preco = km * 0.45;
        }
        System.out.println("    ");
        System.out.printf("Quilômetros percorridos: %.2f%n", km);
        System.out.println("___________________________");
        System.out.println("Valor de taxa a pagar: R$" + preco);


    }

}
