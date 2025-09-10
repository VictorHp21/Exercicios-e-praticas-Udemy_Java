package Entities;

public class Conta_Bancaria {
    private int numeroConta;
    private String nomeTitular;
    private double depositoInicial;
    private double saldo;


    public Conta_Bancaria(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.depositoInicial = depositoInicial;
        this.saldo = depositoInicial;
    }


    public int getNumeroConta() {
        return numeroConta;
    }



    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double getDepositoInicial() {
        return depositoInicial;
    }

    //metodos

    public void deposito( double valorDeposito){
        saldo += valorDeposito;
    }

    public void saque( double valorSaque){
        saldo -= valorSaque;
        saldo -= 5.00;
    }

    public void dadosConta(){
        System.out.println("Account " + getNumeroConta() + ", Holder: " + getNomeTitular() + ", Balance: $ " + getSaldo());
    }





}

