import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strpath = sc.nextLine();

        File path = new File(strpath);

        //nome do arquivo
        System.out.println("Get Name: " + path.getName());



        //caminho do arquivo
        System.out.println("Get Parent: " + path.getParent());

        //caminho completo
        System.out.println("Get Path: " + path.getPath());


        sc.close();

    }
}