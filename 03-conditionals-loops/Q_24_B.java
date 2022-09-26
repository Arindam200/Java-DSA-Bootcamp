import java.util.Scanner;

public class Q_24_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int sum = 0;

        while (true){
            System.out.print("Enter the number: ");
            int a= in.nextInt();
            sum = sum+a;
            if (a ==0){
                break;
            }
        }

        System.out.print("The Sum is: "+sum);
    }
}
