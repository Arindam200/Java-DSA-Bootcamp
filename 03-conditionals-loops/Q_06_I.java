import java.util.Scanner;

public class Q_06_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int a = in.nextInt();

        System.out.print("Enter the commission rate(in %) : ");
        int b = in.nextInt();


        int c = a*b/100;
        System.out.print("The commission yo be paid is  "+c);
    }
}
