package Model.entities;

import Model.exceptions.InvalidValueException;

public class contaCorrente extends Conta {

    public contaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void sacar(double valor) throws InvalidValueException {
        if (this.saldo < valor + 5.00) {
            throw new InvalidValueException("Saldo insuficiente para saque");
        }
        this.saldo -= valor + 5.00;
        System.out.println("Saque de R$" + valor + " realizado com sucesso! (Taxa R$5)");

    }

    @Override
    public void depositar(double valor) throws InvalidValueException {
        if (valor <= 0) {
            throw new InvalidValueException("Depósito inválido, valor negativo");
        }
        this.saldo += valor;
    }


}
