import java.util.Scanner;

public class Q_17_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = in.nextInt();

        Volume(r);

    }
    static void Volume(int x){
        double v = 4/3*Math.PI*(x*x*x);
        System.out.print("The Volume of the Sphere is : "+v);
    }
}
