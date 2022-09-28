import java.util.Scanner;

public class Q_12_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the marks of Maths:");
        int m = in.nextInt();
        System.out.print("Enter the marks of Physics:");
        int p = in.nextInt();
        System.out.print("Enter the marks of Chemistry:");
        int c = in.nextInt();
        System.out.print("Enter the marks of Computer Science:");
        int cs = in.nextInt();
        System.out.print("Enter the marks of English:");
        int e = in.nextInt();

        double avg = (m+p+c+cs+e)/5;
        System.out.print("The average is "+avg);


    }
}
