package dio.map.exercises;


/*
Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
    modelo = gol - consumo = 14,4km/l
    modelo = uno - consumo = 15,6km/l
    modelo = mobi - consumo = 16,1km/l
    modelo = hb20 - consumo = 14,5km/l
    modelo = kwid - consumo = 15,6km/l
 */

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        // Em maps se usa "put" ao invés de "add"

        // "put" com key e novo valor para susbtituir um valor;
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);

        // "containsKey" para verificar se uma key existe no conjunto
        System.out.println("Verifique se o modelo tucson está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("tucson")); // retorna false

        // "get" para recuperar o valor de uma key
        System.out.println("Exiba o consumo do uno: ");
        System.out.println(carrosPopulares.get("uno")); // retorna 15.6

        // Exiba o terceiro modelo adicionado
        // > HashMap não mantém ordem, então não é possível exibir esse elemento;

        // "keySet" agrupa todas as keys de um Map em um Set
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        // "values" agrupa todos os values de um Map em uma Collection
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);


        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        // Collections.max() verifica o maior valor dentro de uma Collection
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        // "entrySet()" retorna um Set e seus elementos são "key = value" do tipo "entry"
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
           if(entry.getValue().equals(consumoMenosEficiente)) {
               modeloMenosEficiente = entry.getKey();
               System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
           }
        }

        // "iterator" é um objeto que pode ser usando para iterar uma "Collection"
        // aqui o iterator é chamado logo após ".values()" - que retorna uma collection.
        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("A soma dos consumos é " + soma);


        System.out.println("Exiba a média dos consumos deste dicionário de carros");
        System.out.println(soma / carrosPopulares.size());

        System.out.println("Remova os modelos com consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()) {
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Verifique se o dicionário está vazio: ");
        System.out.println(carrosPopulares.isEmpty());
    }
}
