package Entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario (int id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }


    public void aumentaSalario( double valor){
        this.salario = this.salario * (1 + (valor / 100));
    }

    public void ExibirFuncionario(){
        System.out.println("\nID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
