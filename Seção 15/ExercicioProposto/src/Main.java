import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // nome, preco unitario e quantidade        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner s = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<>();

        String path = "C:\\Users\\victo\\OneDrive\\Desktop\\Curso JAVA Udemy\\Praticas com intellij\\Seção 15\\ExercicioProposto\\sales.csv.txt";


        try (BufferedReader sales = new BufferedReader(new FileReader(path))) {

            String linha;

          /*  String line = sales.readLine();
            while (line != null) {
                System.out.println(line);
                line = sales.readLine();
            } */

            // Ler o cabeçalho e ignorar se necessário
            linha = sales.readLine(); // primeira linha (nome,preco_unitario,quantidade)

            // Ler os dados
            while ((linha = sales.readLine()) != null) {
                // Separar os campos por vírgula (ou ponto e vírgula, se for o caso)
                String[] campos = linha.split(",");

                // Extrair e converter os dados
                String nome = campos[0];
                int quantidade = Integer.parseInt(campos[1]);
                double precoUnitario = Double.parseDouble(campos[2].replace(",", "."));

                // Calcular o valor total para a linha atual
                double valorTotal = quantidade * precoUnitario;

                // Adicionar a linha ao ArrayList
                linhas.add(nome + "," + valorTotal);
                // pular a linha
                sales.readLine();

                // Imprimir a linha
                System.out.println("Nome: " + nome);
                System.out.println("Quantidade: " + quantidade);
                System.out.println("Preco Unitario: " + precoUnitario);
                System.out.println("Valor Total: " + valorTotal);
                System.out.println();




            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());

        }

      File summary = new File("C:\\Users\\victo\\OneDrive\\Desktop\\Curso JAVA Udemy\\Praticas com intellij\\Seção 15\\ExercicioProposto\\out\\summary.csv.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(summary))) {
            for (String linha : linhas) {
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }




    }

}