import java.util.Scanner;

public class Q_02_B {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Height of the Triangle: ");
        int h = in.nextInt();
        System.out.print("Enter the length of the base of the Triangle: ");
        int b = in.nextInt();
        Area(h,b);
    }
    static void Area(int x,int y){
        int a = (x*y)/2;
        System.out.print("The Area of the Triangle is : " + a);
    }
}
