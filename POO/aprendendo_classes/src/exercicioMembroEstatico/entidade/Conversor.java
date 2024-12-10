package POO.aprendendo_classes.src.exercicioMembroEstatico.entidade;

public class Conversor {


    public static double converte(double valor, double quantidade) {
        double calculo = (valor * quantidade);
        double porcentagem = calculo * 6 / 100;
        double resultado = calculo + porcentagem;

        return resultado;
    }
}


