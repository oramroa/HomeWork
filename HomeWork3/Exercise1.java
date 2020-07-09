package HomeWork3;

public class Exercise1 {
    public int decision(int[] arr, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int n = arr.length;
        Exercise1 obj = new Exercise1();
        System.out.println("Получаем элемент: " + obj.decision(arr, n));
    }
}
