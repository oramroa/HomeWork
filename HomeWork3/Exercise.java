package HomeWork3;

public class Exercise {
    public int decision(int[] arr, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        int n = arr.length;
        Exercise obj = new Exercise();
        System.out.println("Получаем элемент: " + obj.decision(arr, n));

    }
}