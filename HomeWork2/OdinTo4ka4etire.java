package HomeWork2;

import java.util.Scanner;

public class OdinTo4ka4etire {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int e;
        int result;
            System.out.println("Введите число");
        int n = in.nextInt();
            System.out.println("Введите степень");
        int j = in.nextInt();
            in.close();
        for(int i = 0; i <= j; i++) {
                result = 1;
                e = i;
            while (e > 0){
               result = result * n;
              // e--;


            }
            System.out.println("Число " + n + " В степени " + i + " = " + result);
        }

    }

}


