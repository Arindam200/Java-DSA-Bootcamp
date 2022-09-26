import java.util.Scanner;

public class Q_26_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = in.nextInt();
        System.out.print("Enter number 2: ");
        int b = in.nextInt();
        int q = Sum(a,b);
        System.out.print("the sum is: "+q);
    }

    static int Sum(int x, int y) {
        int s = x+y;

        return s;
    }
}
