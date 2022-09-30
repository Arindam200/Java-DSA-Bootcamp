import java.util.Scanner;

public class Q_22_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: " );
        int a = in.nextInt();
        PerfectNum(a);
    }
    static void PerfectNum(int x){
        if(x!=0){

            int sum = 1;
            for (int i = 2;i<x;i++){
                if (x%i==0){
                    sum+=i;
                }
            }
            if (x==sum){
                System.out.print("The number is Perfect number");
            }
        }else{
            System.out.print("'1' is not a perfect number");
        }
    }

}
