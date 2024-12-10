package notaAluno.aplicação;

import notaAluno.entidade.Student;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student resultado = new Student();

        System.out.println("Digite o nome do aluno: ");
        resultado.nome = sc.next();
        System.out.println("Informe as 3 notas do aluno: ");
        System.out.printf("%.2f%n", resultado.somaSimestre(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));

    }
}
