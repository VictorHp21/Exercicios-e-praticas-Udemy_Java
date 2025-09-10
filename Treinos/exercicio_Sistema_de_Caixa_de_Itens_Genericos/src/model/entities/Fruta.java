package model.entities;

public class Fruta implements Comparable<Fruta> {
    private String nome;

    public Fruta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fruta: {" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Fruta o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}
