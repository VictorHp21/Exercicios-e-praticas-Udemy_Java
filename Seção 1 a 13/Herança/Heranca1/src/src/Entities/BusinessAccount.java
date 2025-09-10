package Entities;

public class BusinessAccount extends Account {
    private Double LoanLimit;

    public BusinessAccount() {
        super();
    }


    public BusinessAccount(String holder, Integer number, Double balance, Double loanLimit) {
        super(holder, number, balance);
        this.LoanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return LoanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        LoanLimit = loanLimit;
    }

    // metodo emprestimo (simples)

    public void loan(Double amount) {
        if (amount <= LoanLimit) {
            Balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(Double amount){
            super.withdraw(amount);
            Balance -= 2.0;
        }

    }

