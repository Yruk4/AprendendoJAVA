
import java.util.Scanner;

public class exercicioSogro3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número: ");

        int numDigitado = sc.nextInt();
        int saida = numDigitado;

        while (numDigitado > 0 ) {
            System.out.println(num
Digitado --);
            saida -= 1;
        }
        System.out.println("FIM");

    }

}
