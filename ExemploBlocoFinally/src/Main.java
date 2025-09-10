import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\victo\\OneDrive\\Desktop\\file.txt");
        Scanner s = null;

        try {
            s = new Scanner(file);
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file" + e.getMessage());
        } finally {
            if (s != null) {
                s.close();
            }
        }

        System.out.println("Finaly block executed");

    }
}