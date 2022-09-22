import java.util.Scanner;

public class Q_03_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Height of the Rectangle: ");
        int h = in.nextInt();
        System.out.print("Enter the Width of the Rectangle: ");
        int w = in.nextInt();
        Area(h,w);
    }
    static void Area(int a ,int b){
        int x = a*b;
        System.out.print("The Area of the Rectangle is :  "+x);
    }
}
