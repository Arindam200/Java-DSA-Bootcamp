import java.util.Scanner;

public class Q_09_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int a = in.nextInt();
        Perimeter(a);
    }
    static void Perimeter(int x){
        int p = 3*x;
        System.out.print("The perimeter of the Equilateral Triangle is: "+p);

    }
}
