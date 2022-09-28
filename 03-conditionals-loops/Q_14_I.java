import java.util.Scanner;

public class Q_14_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number where You want to start: ");
        int a = in.nextInt();
        System.out.print("Enter the number where you want to end: ");
        int b = in.nextInt();

        for (int i = a;i<=b;i++){
            if (isArmstrong(i)){
                System.out.println(i+" ");
            }
        }
    }

    public static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n= n/10;
            sum = sum+ rem*rem*rem;

        }
        return sum ==original;
    }
}
