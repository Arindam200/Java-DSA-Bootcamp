import java.util.Scanner;

public class Q_25_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (true){
            System.out.print("Enter the number: ");
            int a= in.nextInt();
            if (a>max){
                max = a;
            }
            if (a ==0){
                break;
            }
        }
        System.out.print("The Maximum value is : "+max);
    }
}
