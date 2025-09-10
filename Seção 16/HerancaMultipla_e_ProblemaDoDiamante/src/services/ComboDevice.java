package services;

// não há sintaxe de herança múltipla em Java
//problema do diamante



/* public class ComboDevice extends Scanner extends Printer {
    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }
}
*/

// Porém, uma classe pode herdar de mais de uma INTERFACE

public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo printing: " + doc);
    }

    @Override
    public String scan() {
        return "Combo scanning";
    }
}

