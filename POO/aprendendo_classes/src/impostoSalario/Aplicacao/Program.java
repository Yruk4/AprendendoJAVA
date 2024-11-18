package POO.aprendendo_classes.src.impostoSalario.Aplicacao;

import POO.aprendendo_classes.src.impostoSalario.Taxa.Imposto;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        Imposto salarioBruto = new Imposto();

        double salarioLiquido;


        System.out.println("Insira o nome do funcionario: ");
        salarioBruto.nome = sc.nextLine();

        System.out.println("Insira o salário bruto do funcionario: ");
        salarioBruto.salarioBruto = sc.nextDouble();

        System.out.println("Insira o valor da taxa: ");
        salarioBruto.taxa = sc.nextDouble();

        System.out.println("Nome: " + salarioBruto.nome);
        System.out.printf("Salario Bruto: %.2f%n", salarioBruto.salarioBruto);
        System.out.printf("Taxa: %.2f%n", salarioBruto.taxa);
        System.out.printf("Salario liquido: %.2f%n", salarioBruto.salarioLiquido());
        System.out.println("Digite a porcentagem do aumento de salario: ");
        System.out.printf("Funcionario: %s    Valor atualizado: %.2f.%n", salarioBruto.nome, salarioBruto.incrementoSalario(sc.nextDouble()));

        sc.close();
    }

}
