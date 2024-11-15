import java.util.Locale;
import java.util.Scanner;

public class exercicioSogro2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite uma nota: ");

        double media = 0;
        double divisivel = 0;
        double soma = 0;
        int notaAlunos = sc.nextInt();

        while (notaAlunos >= 0) {
            soma += notaAlunos;
            System.out.println("Digite uma nota: ");
            notaAlunos = sc.nextInt();
            divisivel += 1;
        }
        media = soma / divisivel;
        System.out.println("A media do aluno é: " + media);

    }
}
