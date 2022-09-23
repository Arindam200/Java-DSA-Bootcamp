import java.util.Scanner;

public class Q_08_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int r = in.nextInt();
        Perimeter(r);
    }
    static void Perimeter(int x ){
        double a = 2* Math.PI * x;
        System.out.print("The Perimeter is : "+ a);
    }
}
