import Entities.Employee;
import Entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        // inserindo lista para objetos diferentes
        ArrayList<Employee> funcionarios = new ArrayList<>();

        //ArrayList<OutsourceEmployee> funcionariosTercerizados = new ArrayList<>();//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text


        System.out.println("Entre com o número de funcionários: ");
        int n = s.nextInt();

        String nome;
        int horas;
        double valorHora, despesa;

        for (int i = 1; i <= n; i++) {
            s.nextLine();
            System.out.println("Funcionário #" + i + " data: ");
            System.out.println("Terceirizado (y/n)? ");
            char ch = s.next().charAt(0);
            if (ch == 'y') {
                System.out.println("Nome: ");
                nome = s.next();

                System.out.println("Valor por hora: ");
                valorHora = s.nextDouble();

                System.out.println("Horas trabalhadas: ");
                horas = s.nextInt();

                System.out.println("Despesa adicional: ");
                despesa = s.nextDouble();

                //funcionariosTercerizados.add(new OutsourceEmployee(nome, horas, valorHora, despesa));
                funcionarios.add(new OutsourceEmployee(nome, horas, valorHora, despesa));
                // Exemplo com variável (caso precise manipular depois)

                     /*   Employee emp = new Employee(nome, horas, valorHora);
                        emp.setDepartamento("Vendas");   // faz algo antes
                        funcionarios.add(emp);

                      */



            } else {
                System.out.println("Nome: ");
                nome = s.next();
                System.out.println("Valor por hora: ");
                valorHora = s.nextDouble();
                System.out.println("Horas trabalhadas: ");
                horas = s.nextInt();

                funcionarios.add(new Employee(nome, horas, valorHora));
            }


            System.out.println("Pagamentos:");

            for (Employee emp : funcionarios) {
                System.out.println(emp.getName() + " $ " + emp.payment());
            }



        }

       s.close();

    }
}