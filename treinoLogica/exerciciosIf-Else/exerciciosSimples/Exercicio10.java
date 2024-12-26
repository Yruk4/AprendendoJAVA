import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {


    /*
    Peça ao usuário seu salário e o valor das vendas do mês.
    Calcule o salário final com as seguintes regras:
    Se as vendas forem maiores ou iguais a 5000, adicione um bônus de 10% ao salário;
    Caso contrário, adicione apenas um bônus de 5%.
     */


        Scanner sc = new Scanner(System.in);

        System.out.println("informe seu salario: ");
        double salario = sc.nextDouble();
        System.out.println("Informe o valor das vendas: ");
        double vendas = sc.nextDouble();

        if (vendas >= 5000) {
            salario += (salario * 0.10);
        } else {
            salario += (salario * 0.05);
        }

        System.out.printf("Salário Atualizado: %.3f", salario);


    }
}