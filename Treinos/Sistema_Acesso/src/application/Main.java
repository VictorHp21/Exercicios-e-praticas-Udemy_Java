package application;

import entities.logEntry;

import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Set<logEntry> logs = new HashSet<>();

        /*  joao      - 2025-07-27T14:21:32.122
            maria     - 2025-07-27T14:23:45.553
            ana       - 2025-07-27T14:24:10.004
            pedro     - 2025-07-27T14:26:02.789
            joao      - 2025-07-27T14:27:17.980
            lucas     - 2025-07-27T14:28:31.112
            ana       - 2025-07-27T14:29:44.901
*/

        logs.add(new logEntry("joao", Date.from(Instant.parse("2025-07-27T14:21:32.122Z"))));
        logs.add(new logEntry("maria", Date.from(Instant.parse("2025-07-27T14:23:45.553Z"))));
        logs.add(new logEntry("ana", Date.from(Instant.parse("2025-07-27T14:24:10.004Z"))));
        logs.add(new logEntry("pedro", Date.from(Instant.parse("2025-07-27T14:26:02.789Z"))));
        logs.add(new logEntry("joao", Date.from(Instant.parse("2025-07-27T14:27:17.980Z"))));
        logs.add(new logEntry("lucas", Date.from(Instant.parse("2025-07-27T14:28:31.112Z"))));
        logs.add(new logEntry("ana", Date.from(Instant.parse("2025-07-27T14:29:44.901Z"))));


        System.out.println("Quantos usuários deseja adicionar: ");
        int n = s.nextInt();

         for (int i = 0; i < n; i++) {
             System.out.println("Digite um nome: ");
             String name = s.next();
             System.out.println("Digite uma data: ");
             Date moment = Date.from(Instant.parse(s.next()));

             logs.add(new logEntry(name, moment));
         }


        System.out.println("Usuários: ");

        for (logEntry log : logs) {
            System.out.println(log);
        }

        System.out.println("Total de usuários: " + logs.size());



    }
}
