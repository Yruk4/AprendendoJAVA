package exercicio_banco;

public class Dados {

    public String nome;
    private int numConta;
    private double saldo;

    public Dados(int numConta, String nome, double saldo) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double adicionarSaldo(double saldoAdicionado) {
        this.saldo += saldoAdicionado;
        return this.saldo;
    }

    public double removerSaldo(double saldoRemovido) {
        this.saldo -= saldoRemovido;
        this.saldo -= 5;
        return this.saldo;
    }


}

