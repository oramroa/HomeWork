package HomeWork2;

public class tablica {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                int result = j * i;

                System.out.print(j + " * " + i + " = " + result + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int x = 1; x <= 10; x++){
            for (int y = 6; y <=9; y++){
                int result1 = y * x;

                System.out.print(y + " * " + x + " = " + result1 + "\t");

            }
            System.out.println();
        }
    }
}


