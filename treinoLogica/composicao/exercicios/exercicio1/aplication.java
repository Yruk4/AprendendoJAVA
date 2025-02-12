import entidades.Departamento;
import entidades.HorasPorContrato;
import entidades.Trabalhador;
import entidadesEnum.NiveldoTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class aplication {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

        System.out.print("Entre com o nome do departamento: ");
        String nomeDoDepartamento = sc.nextLine();
        System.out.println("Digite os dados do trabalhador: ");
        System.out.println("Digite o nome: ");
        String trabalhadorNome = sc.nextLine();
        System.out.println("Digite o nivel: ");
        String trabalhadorNivel = sc.nextLine();
        System.out.println("Digite o salário base: ");
        double trabalhadorSalarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(trabalhadorNome, NiveldoTrabalhador.valueOf(trabalhadorNivel), trabalhadorSalarioBase, new Departamento(nomeDoDepartamento));
        System.out.println("Quantos contratos esse trabalhador vai ter?");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Digite os dado do contrato #" + i + ":");
            System.out.println("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração de horas: ");
            int horas = sc.nextInt();
            HorasPorContrato contrato = new HorasPorContrato(dataContrato, valorPorHora, horas);
            trabalhador.adicionarContrato(contrato);
        }

        System.out.println("Entre com o mês e o ano para calcular (DD/YYYY): ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda de " + mesAno + ":" + String.format("%.2f", trabalhador.renda(ano, mes)));

        sc.close();

    }
}




