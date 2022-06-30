package dio.exercises.set;

import java.util.Objects;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class Linguagem {
    public static void main(String[] args) {

        // Ordem de inserção
        Set<LinguagemFavorita> linguagensOrdemInsercao = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("javascript", 1995d, "vscode4"));
            add(new LinguagemFavorita("html", 1992d, "vscode3"));
            add(new LinguagemFavorita("css", 1994d, "vscode2"));
        }};
        System.out.println("ordem inserção" + linguagensOrdemInsercao);

        // Ordem natural nome;
        Set<LinguagemFavorita> linguagemOrdemNatural = new TreeSet<>(){{
            add(new LinguagemFavorita("javascript", 1995d, "vscode4"));
            add(new LinguagemFavorita("html", 1992d, "vscode3"));
            add(new LinguagemFavorita("css", 1994d, "vscode2"));
        }};
        System.out.println("ordem natural" + linguagemOrdemNatural);

        // IDE
        Set<LinguagemFavorita> ordemIDE = new TreeSet<>(new ComparatorIDE());
        ordemIDE.addAll(linguagemOrdemNatural);
        System.out.println("ordem IDE" + ordemIDE);

        // Ano de criação
        Set<LinguagemFavorita> ordemAnoCriacao = new TreeSet<>(new ComparatorAnoCriacaoNome());
        ordemAnoCriacao.addAll(linguagemOrdemNatural);
        System.out.println("Ano de criação" + ordemAnoCriacao);

        // Nome, Ano de criação, IDE
        Set<LinguagemFavorita> ordemNomeAnoIDE = new TreeSet<>(new ComparatorNomeAnoIDE());
        ordemNomeAnoIDE.addAll(linguagemOrdemNatural);

        for (Object obj: ordemNomeAnoIDE) {
            System.out.println(obj);
        }
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private final String nome;
    private final Double anoDeCriacao;
    private final String ide;

    public LinguagemFavorita(String nome, Double anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() { return nome; }
    public Double getAnoDeCriacao() { return anoDeCriacao; }
    public String getIde() { return ide; }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriacao.equals(that.anoDeCriacao) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public int compareTo(LinguagemFavorita ling) {
        return this.getNome().compareTo(ling.getNome());
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita ide1, LinguagemFavorita ide2) {
        return ide1.getIde().compareTo(ide2.getIde());
    }
}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
        int AnoCriacao = ling1.getAnoDeCriacao().compareTo(ling2.getAnoDeCriacao());
        if(AnoCriacao != 0) return AnoCriacao;

        return ling1.getNome().compareTo(ling2.getNome());
    }
}

class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
        int nome = ling1.getNome().compareTo(ling2.getNome());
        if(nome != 0) return nome;

        int ano = ling1.getAnoDeCriacao().compareTo(ling2.getAnoDeCriacao());
        if(ano != 0) return ano;

        return ling1.getIde().compareTo(ling2.getIde());
    }
}