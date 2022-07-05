package dio.streams.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        // Imprima todos os elementos dessa lista de String
        // numerosAleatorios.stream().forEach(System.out::println);
        numerosAleatorios.forEach(System.out::println);

        // Pegue os 5 primeiros números e coloque dentro de um Set
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        // Transforme esta lista de Strings em uma lista de números inteiros
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Pegue os números pares e maiores que 2 e coloque em uma Lista
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);

        // Mostre a média dos números
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        // Remova os valores impares
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .removeIf(i -> i % 2 != 0);
    }
}
