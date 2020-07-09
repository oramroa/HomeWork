package HomeWork3;

public class Exercise3 {
    public int decision(int[] arr, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10};
        int n = arr.length;
        Exercise3 obj = new Exercise3();
        System.out.println("Получаем элемент: " + obj.decision(arr, n));


    }
}
