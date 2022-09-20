import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int a = input.nextInt();

            if (a%2==0){
                System.out.println("The number is even.");
            } else {
                System.out.println("This number is odd.");
            }
    }
}
