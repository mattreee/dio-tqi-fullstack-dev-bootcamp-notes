package dio.exercises.set;

import java.util.*;

public class Exemplo {
    public static void main(String[] args) {
       Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println("Notas contém a nota 5.0: " + notas.contains(5d));
        // retorna true

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        // retorna 0 é a menor nota

        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        // retorna 9.3

        Iterator<Double> iteratorNotas = notas.iterator();
        Double soma = 0.0;
        while(iteratorNotas.hasNext()) {
            Double next = iteratorNotas.next();
            soma += next;
        }
        System.out.println("Exibir a soma dos valores: " + soma);
        // retorna 33.4

        System.out.println("Média das notas: " + (soma/notas.size()));
        // retorna 5.56

        System.out.println("Remova a nota 0:");
        notas.remove(0.0);

        System.out.println("Remova as notas menores que 7 e exiba na lista");
        Iterator<Double> iteratorNotas2 = notas.iterator();
        while(iteratorNotas2.hasNext()) {
            Double next = iteratorNotas2.next();
            if(next < 7) iteratorNotas2.remove();
        }
        System.out.println(notas);
        // retorna [8.5, 9.3, 7.0]

        System.out.println("Exiba todas as notas na ordem em que foram informadas");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        // notas2.add(7d); elemento duplicado
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        // retorna uma array com as notas na ordem que foram inseridas;

        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        /*
            TreeSet por padrão mantém a ordem natural dos elementos, então
            quando passada uma array fora de ordem ele a ordenará automaticamente.
            Válido mencionar que o notas2 possui a ‘interface’ "Comparable" e não seria
            possível se não tivesse;
         */

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Verifique se o conjunto está vazio: " + notas.isEmpty());
        // retorna true;
    }
}
