package _4_controlStatements.looping.forLoop;

import java.util.Scanner;

public class Demo19Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial "+factorial);
    }
}
