import java.util.Scanner;

public class Q_20_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the Second number: ");
        int b = in.nextInt();

        int z = lcm(a,b);
        System.out.print("The LCM is "+z);
    }static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

}

