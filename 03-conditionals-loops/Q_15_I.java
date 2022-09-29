import java.util.Scanner;

public class Q_15_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n = in.nextInt();

        System.out.print("Enter the r:");
        int r = in.nextInt();

        int p = Permutation(n,r);
        int k = Combination(n,r);

        System.out.print("The nPr value is : "+p);
        System.out.print("& the nCr value is : "+k);



    }
    static int Permutation(int x, int y){
        int z = x-y;
        int w = Factorial(x)/Factorial(z);
        return w;

    }static int Combination(int x, int y) {
        int z = x - y;
        int c = Factorial(x) / Factorial(z)*Factorial(x);
        return c;

    } static int Factorial(int a) {
        int f = 1;
        int i=1;
        while (i<=a){
            f *=i;
            i++;
        }
        return f;

    }
}
