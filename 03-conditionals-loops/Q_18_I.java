import java.util.Scanner;

public class Q_18_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the present value: ");
        int pv = in.nextInt();
        System.out.print("Enter the Time : ");
        int t = in.nextInt();
        double r = 0.13;
        double fv = pv*Math.pow((1+r),t);
        System.out.print("The final value is : "+ fv);

    }
}
