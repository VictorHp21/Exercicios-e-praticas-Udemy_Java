package model.entities;

public class Eletronicos implements Comparable<Eletronicos> {
    private String nome;

    public Eletronicos(String nome) {
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
        return "Eletronicos: {" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Eletronicos o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}
