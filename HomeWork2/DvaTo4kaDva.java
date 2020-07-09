package HomeWork2;

public class DvaTo4kaDva {
    public static void main(String[] args) {
        int[] array = {11, 5, 33, 47, 55, 66, 77, 87, 99};

        System.out.println("Выводим каждый второй элемент массива");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.println(array[i]);

            }
        }
    }
}