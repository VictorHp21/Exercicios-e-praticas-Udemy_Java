import Entities.Pessoa;
import Entities.PessoaJuridica;
import Entities.PessoaFisica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite o número de pessoas: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Fisica ou Juridica? (f/j)? ");
            char ch = sc.next().charAt(0);
            if(ch =='f'){
                sc.nextLine();
                System.out.println("Dados da " + (i + 1) + " pessoa:");
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda Anual: ");
                Double rendaAnual = sc.nextDouble();
                System.out.print("Gastos com saude: ");
                Double gastosSaude = sc.nextDouble();
                pessoas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else if (ch == 'j'){
                sc.nextLine();
                System.out.println("Dados da " + (i + 1) + " pessoa juridica:");
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda Anual: ");
                Double rendaAnual = sc.nextDouble();
                System.out.print("Numero de funcionarios: ");
                Integer numFuncionarios = sc.nextInt();
                pessoas.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
            } else {
                System.out.println("Opção inválida!");
            }


        }

        System.out.println("Impostos pagos: ");
        Double sumImpostos = 0.0;
        for (Pessoa pessoa: pessoas){
            System.out.println(pessoa.getNome() + ": " + "$ " + pessoa.imposto());
            sumImpostos += pessoa.imposto();
        }

        System.out.println("Total de impostos: $ " + sumImpostos);







    }
}