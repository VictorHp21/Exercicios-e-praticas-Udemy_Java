package model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate Date;
    private Double totalValue;

    private List<Installment> installment = new ArrayList<>();



    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        Date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallment() {
        return installment;
    }

}
