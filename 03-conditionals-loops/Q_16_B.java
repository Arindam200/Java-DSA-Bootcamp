import java.util.Scanner;

public class Q_16_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = in.nextInt();

        System.out.print("Enter the height: ");
        int h = in.nextInt();


        Volume(r,h);

    }
    static void Volume(int x,int y){
        double v = Math.PI*(x*x)*y;
        System.out.print("The Volume of the Cylinder is : "+v);
    }
}
