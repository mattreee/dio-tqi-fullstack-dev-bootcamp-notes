package dio.exercises.set;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>(){{
            add("vermelho");
            add("laranja");
            add("amarelo");
            add("verde");
            add("azul");
            add("indigo");
            add("violeta");
        }};

        // Exibir uma abaixo da outra
         for (String cor: cores) {
            System.out.println(cor);
         }

        // Quantidade de cores do arco iris
         System.out.println(cores.size());

        // Exibir cores em ordem alfabética
         Set<String> coresOrdenadas = new TreeSet<>(cores);
         System.out.println(coresOrdenadas);

        // Exibir em ordem inversa
         LinkedHashSet<String> coresReverse1 = new LinkedHashSet<>(cores);
         ArrayList<String> coresReverse2 = new ArrayList<>(coresReverse1);
         Collections.reverse(coresReverse2);
         System.out.println(coresReverse2);

        // Exiba todas as cores que começam com a letra "V"
        Set<String> comecaComV = new HashSet<>();
        for (String cor: cores) {
            if(cor.startsWith("v") || cor.startsWith("V")) comecaComV.add(cor);
        }
        System.out.println(comecaComV);

        // Remova todas as cores que não começam com a letra "V"
        Set<String> naoComecaComV = new HashSet<>();
        for (String cor: cores) {
            if(!cor.startsWith("v")) naoComecaComV.add(cor);
        }
        System.out.println(naoComecaComV);

        // Verifique se o conjunto está vazio
        System.out.println(cores.isEmpty());

        // Limpe o conjunto
        cores.clear();
    }
}
