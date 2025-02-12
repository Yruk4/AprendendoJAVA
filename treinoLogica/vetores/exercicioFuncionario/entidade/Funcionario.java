package exercicioFuncionario.entidade;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, Double salario, String nome) {
        this.id = id;
        this.salario = salario;
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String toString() {
        return "Funcionario{id=" + id + ", nome='" + nome + "', salario=" + salario + "}";
    }
}
