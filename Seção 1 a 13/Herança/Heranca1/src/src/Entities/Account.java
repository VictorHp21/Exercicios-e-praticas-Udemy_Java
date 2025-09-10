package Entities;

public class Account {
    private Integer Number;
    private String Holder;
    protected Double Balance;

    public Account(){}

    public Account(String holder, Integer number, Double balance) {
        Holder = holder;
        Number = number;
        Balance = balance;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
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

    // metodos

    public void withdraw(Double amount) {
        Balance -= amount + 5.0;
    }

    public void deposit(Double amount) {
        Balance += amount;
    }



}
