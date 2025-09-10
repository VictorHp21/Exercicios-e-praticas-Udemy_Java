package application;

import services.ComboDevice;
import services.ConcretePrinter;
import services.ConcreteScanner;


public class Main {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println("---");

        ComboDevice c = new ComboDevice("500");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());



    }
}
