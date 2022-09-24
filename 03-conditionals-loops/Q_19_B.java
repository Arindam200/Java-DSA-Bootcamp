import java.util.Scanner;

public class Q_19_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = in.nextInt();

        System.out.print("Enter the height: ");
        int h = in.nextInt();


        Volume(r,h);

    }
    static void Volume(int x,int y){
        double v = 2*Math.PI*x*y;
        System.out.print("The Curved Surface Area Of Cylinder is : "+v);
    }
}
