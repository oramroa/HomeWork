package HomeWork1;


public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 42;// Двоичный код 101010
        int b = 15;// Двоичный код 1111
        System.out.println(~a);// Двоичный код 11111111111111111111111111010101

        System.out.println(~b);// Двоичный код 11111111111111111111111111110000

        System.out.println(a & b);// Двоичный код 1010

        System.out.println(a &= b);// Двоичный код 1010
            a = 42;
            b = 15;
        System.out.println(a | b);// Двоичный код 101111

        System.out.println(a |= b);// Двоичный код 101111
            a = 42;
            b = 15;
        System.out.println(a ^ b);// Двоичный код 100101

        System.out.println(a ^= b);// Двоичный код100101
            a = 42;
            b = 15;
        System.out.println(a >> b);// Двоичный код 0

        System.out.println(a >>= b);// Двоичный код 0
            a = 42;
            b = 15;
        System.out.println(a << b);// Двоичный код 101010000000000000000

        System.out.println(a <<= b);// Двоичный код 101010000000000000000
            a = 42;
            b = 15;
        System.out.println(a >>> b);// Двоичный код 0
        System.out.println(a >>>= b);// Двоичный код 0
    }
}
