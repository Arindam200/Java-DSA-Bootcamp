import java.util.Scanner;

public class Q_18_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base length: ");
        int b = in.nextInt();

        System.out.print("Enter the height: ");
        int h = in.nextInt();

        System.out.print("Enter the Base width: ");
        int l = in.nextInt();

        Volume(b,h,l);

    }
    static void Volume(int x,int y, int z){
        int v = x*y*z/3;
        System.out.print("The Volume of the Pyramid is : "+v);
    }
}
