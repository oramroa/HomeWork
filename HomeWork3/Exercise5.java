package HomeWork3;

public class Exercise5 {
    public int decision(int[] arr, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};
        int n = arr.length;
        Exercise5 obj = new Exercise5();
        System.out.println("Получаем элемент: " + obj.decision(arr, n));
    }
}
