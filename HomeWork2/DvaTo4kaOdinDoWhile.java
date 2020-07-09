package HomeWork2;

import java.util.Scanner;

public class DvaTo4kaOdinDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Заполните массив");
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Заполненый массив");

        int j = 0;
        do {
            System.out.print(arr[j] + " ");
            j++;
        }while (j < 7);

    }
}





