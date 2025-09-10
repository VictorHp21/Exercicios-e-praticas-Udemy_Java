import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int m, n;

        System.out.println("Digite o número de linhas: ");
        m = s.nextInt();

        System.out.println("Digite o número de colunas: ");
        n = s.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = s.nextInt();
            }
        }




        System.out.println("Digite um número x: ");
        int x = s.nextInt();

        int numeroEncontrado = 0;

        int esquerda, acima, direita, abaixo = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Posição: " + i + "," + j);

                    if (j > 0) {
                        System.out.println("À esquerda: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("À direita: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Abaixo: " + mat[i + 1][j]);
                    }
                }
            }
        }

        s.close();

    }
}