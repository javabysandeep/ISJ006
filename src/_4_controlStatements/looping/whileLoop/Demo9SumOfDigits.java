package _4_controlStatements.looping.whileLoop;

import java.util.Scanner;

public class Demo9SumOfDigits {
    public static void main(String[] args) {
        int num = 4532;

        //take mod
        //divide the number
        int sum = 0;

        int digit = num % 10;
        sum = sum + digit;
        System.out.println(digit);//4532%10 =--->2
        num = num / 10; //4532/10 ---> 453

        digit = num % 10;
        sum = sum + digit;
        System.out.println(digit);// 453 % 10 ---> 3
        num = num / 10; // 453 /10 ---> 45

        digit = num % 10;
        sum = sum + digit;
        System.out.println(digit);//45 % 10 ----> 5
        num = num / 10;   // 45 / 10 ----> 4

        digit = num % 10;
        sum = sum + digit;
        System.out.println(digit);// 4 % 10 ---> 4
        num = num / 10; // 4/10 ---> 0

        System.out.println("Sum of digits "+sum);

    }
}
