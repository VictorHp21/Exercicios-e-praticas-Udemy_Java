public class Main {
    public static void main(String[] args) {

        Client c1 = new Client("Pedro", "pedro@.com.br");
        Client c2 = new Client("bob", "alex@.com.br");

        Client c3 = new Client("bob", "joao@.com.br");

        Client c4 = new Client("Pedro", "pedro@.com.br");

        // comparando nome e email olhe na classe Client

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));

        System.out.println(c2.equals(c3));

        System.out.println(c1.equals(c4));

        System.out.println("---------------------");

        // comparando apenas o endereço de memória
        // por isso da false
        System.out.println(c1 == c4);

        System.out.println("---------------------");


        // Há um tratamento especial para String (Literais)
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);


        System.out.println("---------------------");

        // tanto que esse aqui da false

        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s3 == s4);



    }
}
