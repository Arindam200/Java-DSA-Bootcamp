import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        System.out.print("Enter your money(INR): ");
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();

        float D= (float) (r/61.06);
        System.out.print("Your money in USD will be: "+ D);
    }

}
