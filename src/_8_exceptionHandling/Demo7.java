package _8_exceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("1");
            System.out.println("2");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("divide by zero");
            System.out.println(10 / 0);
        }
        System.out.println("rest of the code");
    }
}
