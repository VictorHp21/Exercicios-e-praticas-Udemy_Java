package Model.entities;

public class Funcionario {
    protected String nome;
    protected int horas;
    protected double valorHora;

    public Funcionario(String nome, int horas, double valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    // metodo
    public double pagamento(){
        return horas * valorHora;
    }

    @Override
    public String toString() {
        return  nome + " - R$ " + String.format("%.2f", pagamento());
    }
}
