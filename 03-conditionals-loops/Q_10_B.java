import java.util.Scanner;
public class Q_10_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int a = in.nextInt();

        System.out.print("Enter the side: ");
        int b = in.nextInt();
        Perimeter(a,b);

    }
    static void Perimeter(int x,int y ){
        int p = 2*(x+y);
        System.out.print("The Perimeter of the Parallelogram is : "+p);
    }

}
