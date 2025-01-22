import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List <String> list = new ArrayList<>();

        /*
        Adicionar algum elemento na lista
         */

        list.add("Maria");
        list.add("Pedro");
        list.add("João");
        list.add("Carlos");
        list.add("Marcia");
        list.add("Murilo");

        /*
        Trocar o elemento na lista, no exemplo
        vou trocar o "Pedro" por "Marco.
         */
        list.add(2,"Marco");

        //Ver o tamanho da lista:
        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }

        /*
        Remover elemento:
        Obs: pode ser removido por comparação entre elementos, posição ou predicado.
         */
        list.remove("Carlos");
        list.remove("Pedro");

        for (String x : list){
            System.out.println(x);
        }

        //usando predicado
        list.removeIf(x -> x.charAt(0) == 'M');

    }

}
