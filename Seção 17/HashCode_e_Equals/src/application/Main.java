package application;

public class Main {
    public static void main(String[] args) {

        // equals
        /* Método que compara se o objeto é igual a outro, retornando
        true ou false */

        String a = "Maria";
        String b = "Joao";

        System.out.println(a.equals(b));

        System.out.println("--------------------------------");

        // hashCode
         /* Método que retorna um número inteiro representando um código gerado
        a partir das informações do objeto */

        String c = "Maria";
        String d = "Alex";
        String e = "Maria";

        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(e.hashCode());

        // Muito raro mas pode haver colisão de hashcode


    }
}
