import java.util.Scanner;

public class Q_19_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int z = HCF(a,b);
        System.out.print("The HCF is "+ z);
    }
    static int HCF(int a, int b){
        int res = Math.min(a,b);
        while (res>0){
            if (a%res == 0 && b % res == 0){
                break;
            }
            res--;
        }
        return res;
    }
}
