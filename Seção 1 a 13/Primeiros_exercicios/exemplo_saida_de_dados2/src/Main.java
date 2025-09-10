import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                String s1, s2, s3;
                int x;


                x = sc.nextInt();
                // dar outro nextline para consumir a linha q ficou pendente do nextint
                sc.nextLine();
                s1 = sc.nextLine();
                s2 = sc.nextLine();
                s3 = sc.nextLine();


            System.out.println("Dados digitados: ");
                System.out.println(x);
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);

            sc.close();

    }
}