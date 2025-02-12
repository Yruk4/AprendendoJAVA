package entidades;

import entidadesEnum.NiveldoTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NiveldoTrabalhador niveldoTrabalhador;
    private Double salarioBase;

    private Departamento departamento;
    private List<HorasPorContrato> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NiveldoTrabalhador niveldoTrabalhador, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.niveldoTrabalhador = niveldoTrabalhador;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NiveldoTrabalhador getNiveldoTrabalhador() {
        return niveldoTrabalhador;
    }

    public void setNiveldoTrabalhador(NiveldoTrabalhador niveldoTrabalhador) {
        this.niveldoTrabalhador = niveldoTrabalhador;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasPorContrato> getContratos() {
        return contratos;
    }


    public void adicionarContrato(HorasPorContrato contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(HorasPorContrato contrato) {
        contratos.remove(contrato);
    }

    public double renda(int ano, int mes) {
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (HorasPorContrato c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
