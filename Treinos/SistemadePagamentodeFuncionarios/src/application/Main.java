package application;

import Model.entities.Funcionario;
import Model.entities.Terceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        List<Funcionario> funcionarios  = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++){
        System.out.println("Funcionario #" + i + ":");
            System.out.println("É terceirizado? (s/n)? ");
            char opcao = s.next().charAt(0);
            s.nextLine();
            System.out.println("Nome: ");
            String nome = s.nextLine();
            System.out.println("Horas trabalhadas: ");
            int horas = s.nextInt();
            System.out.println("Valor por hora: ");
            double valorHora = s.nextDouble();

             if (opcao == 's'){
                 System.out.println("Despesa adicional: ");
                 double despesaAdiocional = s.nextDouble();
                 funcionarios.add(new Terceirizado(nome, horas, valorHora, despesaAdiocional));
             } else {
                 funcionarios.add(new Funcionario(nome, horas, valorHora));
             }
        }

        System.out.println("Pagamentos: ");
        for (Funcionario f : funcionarios){
            System.out.println(f);

        }


    }
}
