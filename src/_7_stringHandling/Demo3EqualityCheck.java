package _7_stringHandling;

public class Demo3EqualityCheck {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
    }
}
