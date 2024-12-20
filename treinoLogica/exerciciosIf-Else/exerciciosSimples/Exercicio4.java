import java.util.Scanner;

public class Exercicio4 {

    /*
    4. Aprovação de Nota
    Peça ao usuário que insira sua nota em uma prova.
    Caso a nota seja maior ou igual a 60, o programa deve exibir "Aprovado"; caso contrário,
    "Reprovado".
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("insira a nota da prova final: ");
        double provaFinal = sc.nextDouble();


        if (provaFinal < 60){
            System.out.println("Aluno reprovado.");
            System.out.println("Nota final: " + provaFinal);
        } else if (provaFinal > 60 && provaFinal <= 100) {
            System.out.println("Aluno aprovado!");
            System.out.print("Nota final: " + provaFinal);
        }

        

    }
}

