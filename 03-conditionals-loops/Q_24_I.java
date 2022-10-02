import java.util.Scanner;

public class Q_24_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        int i = 0;
        while (a>0){
            int z = a%10;
            a= a/10;
            i+=z;
        }
        System.out.print("The sum of the digits is "+i);
    }
}
