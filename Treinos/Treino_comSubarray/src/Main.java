import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int inicio = 0;
        int fim = 3;

        int[] subarray = new int[fim];
        int somaSubarray = 0;

        for(int i = inicio; i < fim; i++) {
            subarray[inicio] = nums[i];
            somaSubarray += nums[i];

        }

        System.out.println("Soma do Subarray: "  + somaSubarray);



        int[] arrayToinvert = {1, 2, 3, 4, 5};
        int[] arrayInvertido = new int[arrayToinvert.length];

        for(int i = 0; i < arrayToinvert.length; i++) {
            arrayInvertido[i] = arrayToinvert[arrayToinvert.length - 1 - i];
        }

        System.out.println("Array Invertido: " + Arrays.toString(arrayInvertido));

        // menor e maior elemento

       int max = Arrays.stream(arrayToinvert).max().getAsInt();
       int min = Arrays.stream(arrayToinvert).min().getAsInt();

       System.out.println("Maior Elemento: " + max);
       System.out.println("Menor Elemento: " + min);

       int soma = Arrays.stream(arrayToinvert).sum();
       System.out.println("Soma dos Elementos: " + soma);

       double media = (double) soma / arrayToinvert.length;
       System.out.println("Media dos Elementos: " + media);

       // Inverter o array (in-place)

        for(int i = 0; i < arrayToinvert.length / 2; i++) {
            int temp = arrayToinvert[i]; // temp = 1
            arrayToinvert[i] = arrayToinvert[arrayToinvert.length - 1 - i]; // array[0] = 5
            arrayToinvert[arrayToinvert.length - 1 - i] = temp; // array[4] = 1
        }

        System.out.println("Array Invertido: " + Arrays.toString(arrayToinvert));



    }



}
