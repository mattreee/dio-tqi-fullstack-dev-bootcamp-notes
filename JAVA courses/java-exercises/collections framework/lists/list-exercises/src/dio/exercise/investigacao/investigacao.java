package dio.exercise.investigacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class investigacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>(){{
            add("Telefonou para a vítima?");
            add("Esteve no local do crime?");
            add("Mora perto da vítima?");
            add("Devia para a vítima?");
            add("Já trabalhou com a vítima?");
        }};
        List<String> respostas = new ArrayList<>();
        int quantidadeSims = 0;

        for (String pergunta: perguntas) {
            System.out.println(pergunta);
            String input = scanner.next();
            int repeat = 1;

            while(repeat == 1){
                if(input.equals("s")) {
                    respostas.add(input);
                    repeat = 0;
                } else if (input.equals("n")) {
                    respostas.add(input);
                    repeat = 0;
                } else {
                    System.out.println(pergunta);
                    input = scanner.next();
                }
            }
        }

        for (String resp : respostas) {
            if(resp.equals("s")) quantidadeSims++;
        }
        if(quantidadeSims <= 1) System.out.println("Inocente");
        else if(quantidadeSims == 2) System.out.println("Suspeita");
        else if(quantidadeSims <= 4) System.out.println("Cúmplice");
        else if(quantidadeSims == 5) System.out.println("Assassina");
    }
}
