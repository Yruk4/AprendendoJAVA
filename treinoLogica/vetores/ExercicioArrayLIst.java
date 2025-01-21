package treinoLogica.vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioArrayLIst {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de funcionarios que você deseja inserir: ");
        int quantFuncionario = sc.nextInt();

        List<Funcionario> lista = new ArrayList<>();

        for (int i = 0; i < quantFuncionario; i++) {
            System.out.print("Digite o ID do Funcionario: ");
            int id = sc.nextInt();

            while (!sc.hasNextInt()) {
                System.out.println("Digite um número inteiro valido.");
                id = sc.nextInt();
            }

            System.out.print("Digite o nome do Funcionario: ");
            String nome = sc.next();

            while (!sc.hasNext()) {
                System.out.println("Digite um nome válido.");
                nome = sc.next();
            }

            System.out.print("Digite o salário do Funcionario: ");
            double salario = sc.nextDouble();

            while (!sc.hasNextDouble()) {
                System.out.println("Digite um valor válido.");
                nome = sc.next();

                lista.add(new Funcionario(id, salario, nome));
            }

            lista.add(new Funcionario(id, salario, nome));
        }

        System.out.println("Digite o ID do funcionario que vai receber o incremento de salario: ");
        Integer funcionarioAumento = lista.indexOf(sc.nextInt(lista.ge));



    }
}



