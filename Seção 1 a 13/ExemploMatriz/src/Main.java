import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        // instancia a matriz na memória
        int[][] mat = new int[n][n];

        // inserindo na matriz

            for (int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[i].length; j++){
                    mat[i][j] = s.nextInt();
                }
            }


        // mostrar diagonal principal

        System.out.println("Main diagonal: ");

            for (int i = 0; i < mat.length; i++){
                System.out.println(mat[i][i] + " ");
            }

        System.out.println("-------------");


        // quantidade de negativos

        int count = 0;

        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < n; j++){
               if(mat[i][j] < 0){
                   count++;
               }
            }
        }


        System.out.println("Números negativos: " + count);

        // para exibir a matriz
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println(); // quebra de linha após cada linha da matriz
            }


        s.close();
    }
}