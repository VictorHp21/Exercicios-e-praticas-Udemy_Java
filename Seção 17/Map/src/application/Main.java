package application;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // uso o treeMap pois o tipo String já possui o compareTo
        Map<String, String> cookies = new TreeMap<>();

                   // chave   // valor
        cookies.put("username","maria");
        cookies.put("email","maria@gmail.com");
        cookies.put("phone","123456789");

    // removendo o email
        cookies.remove("email");

        // n aceita repetições estão ira sobrescrever valor de phone
        cookies.put("phone", "987654321");


        System.out.println("Contains 'phone' hey: " + cookies.containsKey("phone"));

        System.out.println("Phone number: " + cookies.get("phone"));

        System.out.println("Email: " + cookies.get("email"));

        System.out.println("Size: " + cookies.size());


        System.out.println("All cookies: ");

        for (String key : cookies.keySet()) {
                             // a chave         // este get pega o valor
            System.out.println(key + ": " + cookies.get(key));
        }






    }
}
