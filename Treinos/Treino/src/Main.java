import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
      int[] nums = {2,5,7,8,12,14};

     /* int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        System.out.println(max + " " + min);
        */

        int [] numsreverse = new int [nums.length];

       for (int i = 0; i < nums.length; i++){
            numsreverse[i] = nums[nums.length - 1 - i];
       }

       System.out.println(Arrays.toString(numsreverse));




            if (nums[0] > nums[1]){
                System.out.println("Array decrescente");
            } else {
                System.out.println("Array crescente");
            }

            int[] nums2 = {2,4,50,5,23,5,51};

        System.out.println("Digite um número: ");
            int n = s.nextInt();

            int count = 0;

            for (int i = 0; i < nums2.length; i++){
                if (nums2[i] == n){
                    count++;
                }
            }

        System.out.println("Este número se repete " + count + " vezes");


            int max2 = nums2[0];

        int max = Arrays.stream(nums2).max().getAsInt();

        for (int i = 0; i < nums2.length; i++){
               if (nums2[i] < max &&  ((nums2[i] > nums2[i + 1]) &&  (nums2[i] > max2)) ){
                   max2 = nums2[i];
              }


        }

        System.out.println(max);

        System.out.println("O segundo maior número é: " + max2);

        // rotação k posições

        int k = 2;

        int[] nume = {1,2,3,4,5};
        int[] numK = new int[nume.length];

        k = k % nume.length;

        for (int i = 0; i < k; i++){
            numK[i] = nume[nume.length - k + i];
        }

        for (int j = k; j < numK.length; j++){
            numK[j] = nume[j - k];
        }

        System.out.println("Rotação de " + k + " posições: ");

        System.out.println(Arrays.toString(numK));



    }
}
