package escola;

import java.util.ArrayList;

public class Disciplina {

    private String nome;

    public int getCargaHoraria() {
            return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {

        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int cargaHoraria;

    ArrayList<Professor> professores;
    ArrayList<Turma> turmas;
}