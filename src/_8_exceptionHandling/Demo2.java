package _8_exceptionHandling;

public class Demo2 {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        m2();
    }

    private static void m2() {
        m3();
    }

    private static void m3() {
        System.out.printf("m3 method");
    }
}
