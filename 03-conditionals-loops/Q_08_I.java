import java.util.Scanner;

public class Q_08_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the initial value: ");
        double v = in.nextDouble();
        System.out.print("Enter the rate: ");
        double r = in.nextDouble();
        System.out.print("Enter the time: ");
        double t = in.nextDouble();



        float ans = (float) (v*Math.pow((1-r)/100,t));
        System.out.print("The new Value is : "+ans);
    }
}
