package _4_controlStatements.looping.whileLoop;

public class Demo7 {
    public static void main(String[] args) {
        int left = 0;
        int right = 5;
        while (left < right) {
            System.out.println(left + "       " + right);
            left++;
        }
        //0 5
        //1 5
        //2 5
        //3 5
        //4 5
    }
}
