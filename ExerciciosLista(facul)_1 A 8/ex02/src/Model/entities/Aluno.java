package Model.entities;

public class Aluno {

    private String nome;
    private int codigo;
    private int key;

    public Aluno(String nome, int codigo , int key) {
        this.nome = nome;
        this.key = key;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", key=" + key +
                '}';
    }
}
