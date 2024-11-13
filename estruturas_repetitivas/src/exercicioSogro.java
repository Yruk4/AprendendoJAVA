
import java.util.Scanner;
import java.util.Locale;

class exercicioSogro {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Digite a nota do aluno: ");
        int nota = sc.nextInt();

        if ( nota >= 60 && nota <=100) {
            System.out.println(" Aluno aprovado.");
        }else if ( nota >=40 && nota <=59){
            System.out.println("Aluno em recuperação.");
        }else if ( nota < 40 ){
            System.out.println("Aluno reprovado.");
        } else System.out.println("Digite um número de aluno valido.");


        sc.close();

    }
}