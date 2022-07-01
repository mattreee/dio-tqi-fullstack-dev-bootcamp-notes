package dio.map.exercises;

import java.util.*;

public class EstadoExercises {
    public static void main(String[] args) {

        // Crie um dicionário e relacione os estados e suas populações
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados);

        //Substitua a população de RN
        estados.put("RN", 3534165);
        System.out.println(estados);

        // Verifique se o estado PB está no dicionário, adicione se não
        boolean containsPB = estados.containsKey("PB");
        if (!containsPB) {
            estados.put("PB", 4039277);
        }
        System.out.println(estados);

        // Exiba a população de PE
        System.out.println(estados.get("PE"));

        // Exiba todos os estados e suas populações na ordem que foi informado;
        Map<String, Integer> estadosOrdemInsercao = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosOrdemInsercao);

        // Exiba os estados e suas populações em ordem alfabética;
        Map<String, Integer> estadosOrdemAlfabetica = new TreeMap<>(estados);
        System.out.println(estadosOrdemAlfabetica);

        // Exiba o estado com menor população e sua quantidade;
        Collection<Integer> estadosValues = estados.values();
        Integer estadoMenorPopulacaoNumero = Collections.min(estadosValues);
        String estadoMenorPopulacaoString = "";
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            if(estado.getValue().equals(estadoMenorPopulacaoNumero)) {
                estadoMenorPopulacaoString = estado.getKey();
            }
        }
        System.out.println("Estado menor pop: " + estadoMenorPopulacaoString + " + " + estadoMenorPopulacaoNumero);

        // Exiba o estado com maior população e sua quantidade
        Integer estadoMaiorPopulacaoNumero = Collections.max(estadosValues);
        String estadoMaiorPopulacaoString = "";
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            if(estado.getValue().equals(estadoMaiorPopulacaoNumero)) {
                estadoMaiorPopulacaoString = estado.getKey();
            }
        }
        System.out.println("Estado maior pop: " + estadoMaiorPopulacaoString + " - " + estadoMaiorPopulacaoNumero);

        // Exiba a soma da população destes estados
        Iterator<Integer> iteratorPop = estados.values().iterator();
        Integer somaPopulacoes = 0;
        while(iteratorPop.hasNext()) {
            somaPopulacoes += iteratorPop.next();
        }
        System.out.println("A soma das populações é: " + somaPopulacoes);

        // Exiba a média da população deste dicionário de estados
        int mediaPopulacao = somaPopulacoes / estados.size();
        System.out.println("A média da população é: " + mediaPopulacao);

        // Remova os estados com a população menor que 4.000.000
        Iterator<Integer> iteratorPopMenor4M = estados.values().iterator();
        while (iteratorPopMenor4M.hasNext()) {
            if(iteratorPopMenor4M.next() < 4000000) {
                iteratorPopMenor4M.remove();
            }
        }
        System.out.println(estados);

        // Apague o dicionário
        estados.clear();

        // Verifique se o dicionário está vazio
        estados.isEmpty();
    }
}

class Estado {
    private final String estado;
    private final Double populacao;

    public Estado(String estado, Double populacao) {
        this.estado = estado;
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public Double getPopulacao() {
        return populacao;
    }

    @Override
    public String toString() {
        return "{" +
                "estado='" + estado + '\'' +
                ", populacao=" + populacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado1 = (Estado) o;
        return estado.equals(estado1.estado) && populacao.equals(estado1.populacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estado, populacao);
    }
}
