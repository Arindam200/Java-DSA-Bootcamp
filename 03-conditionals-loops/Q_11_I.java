import java.util.Scanner;

public class Q_11_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle balance : ");
        int p = in.nextInt();
        double rate = 0.13;
        System.out.print("The rate is "+rate);
        System.out.print("Number of times interest applied per time period: ");
        int n = in.nextInt();
        System.out.print("Number of time periods elapsed : ");
        int t = in.nextInt();

        double A = p*(Math.pow(1+(rate/n),n*t));
        System.out.print("The final amount is "+A);

    }
}
