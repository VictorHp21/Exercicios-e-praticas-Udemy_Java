package Model.entities;

public class Terceirizado extends Funcionario {
    private double despesaAdicional;

    public Terceirizado(String nome, int horas, double valorHora, double despesaAdicional) {
        super(nome, horas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    public double pagamento(){
        return super.pagamento() + despesaAdicional * 1.1;
    }
}
