package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\victo\\OneDrive\\Desktop\\Curso JAVA Udemy\\Praticas com intellij\\Seção 17\\exercicio_proposto_Map\\listvotes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Map<String, Integer> votes = new HashMap<>();


            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String key = fields[0];
                Integer value = Integer.parseInt(fields[1]);



                // Soma os votos
                if (votes.containsKey(key)) {
                    votes.put(key, votes.get(key) + value);
                } else {
                    votes.put(key, value);
                }


                line = br.readLine();
            }

            System.out.println("Total de votos por candidato: ");

            for (Map.Entry<String, Integer> entry : votes.entrySet()) {
                System.out.println(entry.getValue() + ": " + entry.getKey());
            }



        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
