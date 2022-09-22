import java.util.Scanner;
public class Q_01_B {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the Circle: ");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        Area(r);
    }
    static void Area(int radius){
        double a = Math.PI *(radius*radius);
        System.out.print("The area of this Circle is: "+a);
    }
}
