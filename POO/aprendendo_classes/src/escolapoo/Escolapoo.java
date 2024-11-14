package escolapoo;

import escola.Disciplina;

public class Escolapoo {

    public static void main(String[] args) {
        //instanciação
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome ("Matematica");
        disciplina1.setCargaHoraria(-10);

        System.out.println(disciplina1.getNome());
        System.out.println(disciplina1.getCargaHoraria());

    }
}
