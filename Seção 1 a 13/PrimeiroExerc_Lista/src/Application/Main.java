package Application;

import Entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        List<Funcionario> Funcionarios = new ArrayList<>();

        System.out.println("Hello, world!");

        System.out.println("Quantos funcionários deseja cadastrar? ");
        int n = s.nextInt();

        int id;
        String nome;
        Double salario;

            for(int i = 0; i < n; i++){
                System.out.println("Digite o ID do " + (i+1) + "º funcionário: ");
                id = s.nextInt();

                s.nextLine();

                System.out.println("Digite o nome do " + (i+1) + "º funcionário: ");
                nome = s.nextLine();

                System.out.println("Digite o salario do " +  (i+1) + "º funcionário: ");
                salario = s.nextDouble();

                Funcionario funcionario = new Funcionario(id, nome, salario);

                Funcionarios.add(funcionario);
            }


        System.out.println("Digite o Id do funcionário que deseja aumentar o salario: ");
            int idNum = s.nextInt();

            Funcionario funcionarioEncontrado = null;

               for (Funcionario f: Funcionarios){
                   if (f.getId() == idNum){
                       funcionarioEncontrado = f;
                       break;
                   }
               }

                   if (funcionarioEncontrado != null){
                       System.out.println("Digite a porcentagem que deseja aumentar no salario deste funcionário: ");
                       double valor = s.nextDouble();
                       funcionarioEncontrado.aumentaSalario(valor);
                       } else {
                           System.out.println("**** Funcionário não encontrado ****");
                       }


        System.out.println("Os funcionários presentes na lista são:");

                   for (Funcionario func: Funcionarios){
                       func.ExibirFuncionario();
                   }


    }

}
