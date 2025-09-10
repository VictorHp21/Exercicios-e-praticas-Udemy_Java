
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path= "C:\\Users\\victo\\OneDrive\\Desktop\\Curso JAVA Udemy\\Praticas com intellij\\Seção 16\\InterfaceComparable\\textNomesSalario.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsv = br.readLine();
            //lendo o arquivo e guardando os nomes em uma lista
            while (employeeCsv!= null) {
                String[] fields = employeeCsv.split(",");

                //outra forma seria
                // String name = fields[0];
                // double salary = Double.parseDouble(fields[1]);

                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv= br.readLine();
            }

            //ordenando a lista
            Collections.sort(list);

            //imprimindo a lista
            for(Employee emp: list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}