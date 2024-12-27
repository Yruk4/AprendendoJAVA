package treinoLogica.vetores.exercicios.exercicio3_Alturas.entidade;

public class Pessoas {

    private String nome;
    private int idade;
    private double altura;

    public Pessoas(String nome, int idade, double altura) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
