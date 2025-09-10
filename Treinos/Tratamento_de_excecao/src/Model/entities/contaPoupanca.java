package Model.entities;

import Model.exceptions.InvalidValueException;

public class contaPoupanca extends Conta {
    public contaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void sacar(double valor) throws InvalidValueException {
        if (this.saldo < valor) {
            throw new InvalidValueException("Saldo insuficiente para saque");
        }
        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso!");
    }

    @Override
    public void depositar(double valor) throws InvalidValueException {
        if (valor <= 0) {
            throw new InvalidValueException("Depósito inválido, valor negativo");
        } else {
            this.saldo += valor;
        }
    }
}
