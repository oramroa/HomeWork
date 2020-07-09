package HomeWork2;

public class OdinTo4kaP9t {
    public static void main(String[] args) {
        long b = 1;
        for (; b <= Long.MAX_VALUE / 3;) {
            b = b * 3;
        }
        System.out.println("До переполнения " + b);
        System.out.println("После переполнения " + b * 3);

    }
}
