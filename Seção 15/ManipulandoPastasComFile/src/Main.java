import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho de uma pasta: ");
        String pasta = sc.nextLine();

        File path = new File(pasta);
// listagem de pastas    // função como argumento de uma funcao
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Pastas:");

        for (File folder : folders) {
            System.out.println(folder);
        }

        // listagem de arquivos
        File[] files = path.listFiles(File::isFile);

        System.out.println("Arquivos:");

        for (File file : files) {
            System.out.println(file);
        }


        boolean sucess = new File(pasta + "\\teste").mkdir();
        System.out.println("Directory created: " + sucess);



        sc.close();

    }
}