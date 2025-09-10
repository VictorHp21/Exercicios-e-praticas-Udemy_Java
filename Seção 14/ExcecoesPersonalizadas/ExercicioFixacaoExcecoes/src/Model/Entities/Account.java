package Model.Entities;

import Model.Exceptions.DomainException;

public class Account {
    private Integer number;
    private String Holder;
    private Double Balance;
    private Double WithDrawLimit;

    public  Account(){}

    public Account(Integer number, String Holder, Double Balance, Double WithDrawLimit) {
        this.number = number;
        this.Holder = Holder; // titular da conta
        this.Balance = Balance;
        this.WithDrawLimit = WithDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return Holder;
    }

    public void setHolder(String holder) {
        Holder = holder;
    }

    public Double getBalance() {
        return Balance;
    }



    public Double getWithDrawLimit() {
        return WithDrawLimit;
    }

    public void deposit(Double amount){
        this.Balance += amount;
    }
                //sacar
    public void withdraw(Double amount) throws DomainException {
        if (amount > this.WithDrawLimit || amount > this.Balance){
            throw new DomainException( "Withdraw error: The amount exceeds withdraw limit or not enough balance");
        } else {
            this.Balance -= amount;
        }
        }


    }



