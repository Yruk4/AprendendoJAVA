package notaAluno.entidade;

public class Student {

    public String nome;
    public String resultado;

    public double  somaSimestre(double nota1, double nota2, double nota3) {

        double resultado = nota1 + nota2 + nota3;
        if (resultado >= 60 && resultado <= 100) {
            System.out.println("Aluno: " + nome);
            System.out.print("Passou.  RESULTADO FINAL: ");
        } else if (resultado >= 0 && resultado <= 59) {
            System.out.println("Aluno: " + nome);
            System.out.println("Reprovado");
            System.out.printf("Pontos faltantes: %.2f%n", 60 - resultado);
            System.out.printf("Nota final: ");
        } else {
            System.out.println("Nota invalida.");
        } return resultado;
    }
}
