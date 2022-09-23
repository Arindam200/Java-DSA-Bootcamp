import java.util.Scanner;

public class Q_14_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        int r = in.nextInt();


        System.out.println("Enter the Height: ");
        int h = in.nextInt();

        Volume(r,h);


    }
    static void Volume(int x,int y ){
        double v = Math.PI*(x*x)*y/3;
        System.out.print("The Volume of the cone is: "+v);

    }
}
