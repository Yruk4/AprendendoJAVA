package POO.aprendendo_classes.src.estoque.apliccation;

import POO.aprendendo_classes.src.estoque.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Insira os dados do produto.");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Preco: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(name,preco,quantidade);

        produto.setName("Computador");
        System.out.println("Nome atualizado teste: " + produto.getName());


        System.out.println();
        System.out.println("Código do produto: "+ produto);

        System.out.println();
        System.out.print("Entre com o número de produtos para serem adicionados ao Estoque: ");
        quantidade = sc.nextInt();
        produto.addProdutos(quantidade);

        System.out.println();
        System.out.println("Produto atualizado: "+ produto);

        System.out.println();
        System.out.print("Entre com o número de produtos para serem removidos do Estoque: ");
        quantidade = sc.nextInt();
        produto.removeProdutos(quantidade);

        System.out.println();
        System.out.println("Produto atualizado: "+ produto);




        sc.close();
    }
}
