import java.util.Scanner;

public class Q_12_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Side: ");
        int a = in.nextInt();

        Perimeter(a);

    }
    static void Perimeter(int x ){
        int p = 4*(x);
        System.out.print("The Perimeter of the Square is : "+p);
    }
}
