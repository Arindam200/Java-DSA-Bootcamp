import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        System.out.print("Enter Your Principal: ");
        Scanner p = new Scanner(System.in);
        int principal = p.nextInt();

        System.out.print("Enter Your Time(in Year): ");
        Scanner t = new Scanner(System.in);
        int Time = t.nextInt();

        System.out.print("Enter Your Rate(per annum): ");
        Scanner r = new Scanner(System.in);
        float rate = r.nextFloat();

        float A = principal*(1+ (rate*Time));
        System.out.println("The Final Amount is: "+A);

    }

}
