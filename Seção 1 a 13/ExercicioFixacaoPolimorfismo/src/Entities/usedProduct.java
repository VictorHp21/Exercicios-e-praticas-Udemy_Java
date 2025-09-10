package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class usedProduct extends Product {
    private LocalDate manufactureDate;

    public usedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }



    // metodo
    @Override
    public String priceTag() {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return getName() + " (used) $" + getPrice() + " (Manufacture date: " + getManufactureDate().format(fmt1) + ")";
    }
}
