import java.util.Scanner;

public class Q_11_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int a = in.nextInt();

        System.out.print("Enter the Width: ");
        int b = in.nextInt();
        Perimeter(a,b);

    }
    static void Perimeter(int x,int y ){
        int p = 2*(x+y);
        System.out.print("The Perimeter of the Rectangle is : "+p);
    }
}
