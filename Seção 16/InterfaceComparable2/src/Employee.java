                                // comparavel
public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // metodo que serve para comparar os objetos
    @Override
    public int compareTo(Employee o) {
        //comparas os seus nomes
        //return name.compareTo(o.getName());

        // para ordenar por salario ao inves do nome
        //return Double.compare(salary, o.getSalary());

        // para ordenar por salario em ordem decrescente
        return Double.compare(o.getSalary(), salary);
    }
}
