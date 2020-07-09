package HomeWork3;

public class Exercise4 {
    public int decision(int[] arr, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        int n = arr.length;
        Exercise4 obj = new Exercise4();
        System.out.println("Получаем элемент: " + obj.decision(arr, n));

    }
}
