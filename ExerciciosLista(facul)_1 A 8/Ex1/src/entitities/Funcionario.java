package entitities;

public class Funcionario {
    private String nome;
    private int codigo;
    private int idade;
    private double salario;



    public Funcionario(){}

    public Funcionario(String nome, int codigo, int idade, double salario) {
        this.nome = nome;
        this.codigo = codigo;
        this.idade = idade;
        this.salario = salario;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Nome= " + nome + "\n" + "codigo= " + codigo + "\n" + "idade= " + idade + "\n" + "salario= " + salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
