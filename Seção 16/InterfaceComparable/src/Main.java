
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String path= "C:\\Users\\victo\\OneDrive\\Desktop\\Curso JAVA Udemy\\Praticas com intellij\\Seção 16\\InterfaceComparable\\textNomes.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String name = br.readLine();
            //lendo o arquivo e guardando os nomes em uma lista
            while (name!= null) {
                list.add(name);
                name= br.readLine();
            }

            //ordenando a lista
            Collections.sort(list);

            //imprimindo a lista
            for(String s: list) {
                System.out.println(s);
            }

        } catch(IOException e) {
                System.out.println("Error: " + e.getMessage());
 }
    }
}