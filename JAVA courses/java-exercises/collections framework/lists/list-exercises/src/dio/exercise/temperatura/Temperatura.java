package dio.exercise.temperatura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> Meses = new ArrayList<>(){{
            add("Janeiro");
            add("Fevereiro");
            add("Março");
            add("Abril");
            add("Maio");
            add("Junho");
        }};
        List<Double> TemperaturasList = new ArrayList<>();

        for (String mes: Meses) {
            System.out.println("Insira a temperatura para o mês "+mes);
            TemperaturasList.add(scanner.nextDouble());
        }

        Iterator<Double> iteratorTempList = TemperaturasList.iterator();
        Double mediaSemestral = 0d;
        while(iteratorTempList.hasNext()){
            Double next = iteratorTempList.next();
            mediaSemestral += next;
        }
        mediaSemestral /= TemperaturasList.size();
        System.out.println("A média semestral é "+mediaSemestral);

        System.out.println("Temperaturas acima da média semestral:");
        for (Double temp : TemperaturasList) {
            if(temp > mediaSemestral) {
                System.out.println(Meses.get(TemperaturasList.indexOf(temp)) + " - " + temp);
            };
        }
    }
}
