import java.util.Scanner;

public class Q_01_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        int f = 1;
        int i=1;
        while (i<=a){
            f *=i;
            i++;
        }
        System.out.print("The factorial is "+f);

    }
}
