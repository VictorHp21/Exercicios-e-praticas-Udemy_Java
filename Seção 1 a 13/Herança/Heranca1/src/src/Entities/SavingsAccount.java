package Entities;

public  class SavingsAccount extends Account{
    private Double InterestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(String holder, Integer number, Double balance, Double interestRate) {
        super(holder, number, balance);
        InterestRate = interestRate;
    }

    public Double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(Double interestRate) {
        InterestRate = interestRate;
    }

    // metodo

    public void updateBalance() {
        Balance += Balance * InterestRate;
    }

    // sobreescrever o metodo withdraw da superclasse Account

    @Override // anotacao para indicar que o metodo foi sobrescrito
    public final void withdraw(Double amount) {
        Balance -= amount;
    }
}
