package HomeWork1;

public class PhoneNumber {
    public static String createPhoneNumber (int[] num) {

        return "(" + num[0] + num[1] + num[2] + ")" + "" + num[3] + num[4] + num[5] + "-"
                 + num[6] + num[7] + num[8] + num[9];
    }

    public static void main(String[] args) {
         int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

         System.out.println(createPhoneNumber(b));
    }
}
