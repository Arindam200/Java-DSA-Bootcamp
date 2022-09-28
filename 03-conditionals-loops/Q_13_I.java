import java.util.Scanner;

public class Q_13_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        int i=0;
        int sum = 0;

        while (i<=a){
            sum +=i;
            i++;

        }
        System.out.print("The Sum is "+sum);
    }
}
