package HomeWork2;

import java.util.Arrays;

public class ZadanieTri {
    public static void main(String[] args) {
        int [] arr = { 11, 3, 13, 18, 4};

        boolean isSorted = false;
        int swap;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length -1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    swap = arr[i];
                    arr[i] = arr[i +1];
                    arr[i + 1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
