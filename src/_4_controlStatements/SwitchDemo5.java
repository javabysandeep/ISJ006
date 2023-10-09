package _4_controlStatements;

import java.util.Scanner;

public class SwitchDemo5 {
    public static void main(String[] args) {
        System.out.println("Enter the digit");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        //value : byte, short, int, char, String, enum, Byte, Short, Integer,Character
        switch (digit) {
            case '0':
                System.out.println("zero");
                break;
            case '1':
                System.out.println("One");
                break;
            case '2':
                System.out.println("Two");
                break;
            case '3':
                System.out.println("Three");
                break;
            case '4':
                System.out.println("Four");
                break;
            case '5':
                System.out.println("Five");
                break;
            case '6':
                System.out.println("six");
                break;
            case '7':
                System.out.println("Seven");
                break;
            case '8':
                System.out.println("Eight");
                break;
            case '9':
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid digit");
                break;
        }
    }
}
