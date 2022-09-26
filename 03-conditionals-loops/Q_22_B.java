import java.util.Scanner;

public class Q_22_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int sum = 0;
        int multiply = 1;



        while(n>0){
            int rem = n%10;
            multiply = rem*multiply;
            sum = sum+rem;
            n = n/10;

        }
         int ans = multiply-sum;

        System.out.println("The Subtraction of the Sum from the Multiplication of an integer is: "+ans);

    }
}
