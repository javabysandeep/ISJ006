package interviewPrep;

public class Demo21 {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
