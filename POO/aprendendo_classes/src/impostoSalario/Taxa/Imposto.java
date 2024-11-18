package POO.aprendendo_classes.src.impostoSalario.Taxa;

public class Imposto {

    public String nome;
    public double salarioBruto;
    public double taxa;


    public double salarioLiquido() {
        return salarioBruto -= taxa;
    }

    public double incrementoSalario(double porcentagem) {
        porcentagem = salarioBruto * porcentagem / 100;
        return salarioBruto + porcentagem;
    }

}


