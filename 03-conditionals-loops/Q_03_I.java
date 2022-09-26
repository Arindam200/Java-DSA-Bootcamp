import java.util.Scanner;

public class Q_03_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = in.nextInt();
        AVG(n);
    }
    static void AVG(int n){
        int sum =0;
        int i = 0;
        while (i<=n){
            sum=sum+i;
            i++;

        }
        double avg =sum/n;
        System.out.print("The average is "+avg);
    }
}
