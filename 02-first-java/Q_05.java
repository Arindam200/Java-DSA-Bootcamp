import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        int max = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = in.nextInt();

        if (num1>max){
            max = num1;
        }if (num2>max){
            max=num2;
        }
        System.out.print("The maximum number is: "+max);
    }
}
