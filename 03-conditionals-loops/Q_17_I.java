import java.util.Scanner;

public class Q_17_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a = in.nextInt();
        int z = a;
        int rev = 0;

        while(a>0){
            int x = a%10;
            a=a/10;
            rev = rev*10+x;

        }

        if (z == rev) {
            System.out.print("The number is Palindrome.");
        }else {
            System.out.print("The number is not Palindrome.");
        }
    }
}
