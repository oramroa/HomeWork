package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class ZadanieTriVarDva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Заполните массив");
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Заполненый массив");
         for ( int i: array){
             System.out.print(i + " ");
         }
        System.out.println();
        System.out.println("Сортировка массива");

        boolean sorted = false;
        int swap;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i+1]){
                    sorted = false;

                    swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;

                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
