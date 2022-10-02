import java.util.Scanner;

public class Q_26_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int even =0;
        int neg = 0;
        int odd = 0;
        while(true){
            System.out.print("Enter the number: ");
            int a = in.nextInt();

            if(a%2==0) {
                even+=a;
            } else if (a%2!=0) {
                odd+=a;

            } else if (a<0) {
                neg+=a;

            } else if (a==0) {
                break;

            }
        }
        System.out.print("The sum of odd numbers is "+odd+"& the sum of the even numbers is"+even+"& the sum of the negative numbers is"+neg);
    }
}
