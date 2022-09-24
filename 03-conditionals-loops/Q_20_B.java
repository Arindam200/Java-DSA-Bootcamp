import java.util.Scanner;

public class Q_20_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int r = in.nextInt();

        Area(r);

    }
    static void Area(int x){
        double v = 6*(x*x);
        System.out.print("The Total Surface Area Of Cube is : "+v);
    }
}
