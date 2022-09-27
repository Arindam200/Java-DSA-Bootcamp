import java.util.Scanner;

public class Q_07_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        double b = in.nextInt();
        System.out.print("Enter the power: ");
        double p = in.nextInt();

        int a = (int) Math.pow(b,p);
        System.out.print("The ans is "+a);

    }
}
