package HomeWork1;

public class BitwiseOperations1 {
    public static void main(String[] args) {
        int a = -42; // Двоичный код 11111111111111111111111111010110
        int b = -15; // Двоичный код  11111111111111111111111111110001
        System.out.println(~a); // Двоичный код 101001

        System.out.println(~b); // Двоичный код 1110

        System.out.println(a & b); // Двоичный код 11111111111111111111111111010000

        System.out.println(a &= b); // Двоичный код 11111111111111111111111111010000
            a = -42;
            b = -15;
        System.out.println(a | b); // Двоичный код 11111111111111111111111111110111

        System.out.println(a |= b); // Двоичный код 11111111111111111111111111110111
            a = -42;
            b = -15;
        System.out.println(a ^ b); // Двоичный код 100111

        System.out.println(a ^= b); // Двоичный код 100111
            a = -42;
            b = -15;
        System.out.println(a >> b); // Двоичный код 11111111111111111111111111111111

        System.out.println(a >>= b); // Двоичный код 11111111111111111111111111111111
            a = -42;
            b = -15;
        System.out.println(a >>> b); // Двоичный код 111111111111111

        System.out.println(a << b); // Двоичный код 11111111101011000000000000000000

        System.out.println(a <<= b); // Двоичный код 11111111101011000000000000000000
            a = -42;
            b = -15;
        System.out.println(a >>>= b); // Двоичный код 111111111111111



    }

}
