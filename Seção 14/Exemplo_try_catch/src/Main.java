import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program");


    }

    public static void method1(){
        System.out.println("**** METHOD 1 START***");
        method2();
        System.out.println("**** METHOD 1 END***");
    }

    public static void method2() {
        System.out.println("**** METHOD 2 START***");
        Scanner s = new Scanner(System.in);

        try {
            // lembrando que a posição nos vetores inicia em 0
            String[] vect = s.nextLine().split(" ");

            int position = s.nextInt();

            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace(); // pilha de metodos chamados
            s.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error! Enter an integer position!");
        }

        s.close();
        System.out.println("**** METHOD 2 END***");
    }
}