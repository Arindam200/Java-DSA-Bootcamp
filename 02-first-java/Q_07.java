import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        System.out.print("Enter the number of times You want the fibo series: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        int count=1;

        while (count<=n){
            int temp = b;
            a=temp;
            b=a+b;
            count++;


//        Using for loop:
//        for (int i=1; i <= n;i++){
//            int temp = b;
//              a=temp;
//              b=a+b;

            System.out.println("The answer is : " + b);
        }
    }
}
