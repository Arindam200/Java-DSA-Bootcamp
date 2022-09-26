import java.util.Scanner;

public class Q_23_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = in.nextInt();

        System.out.print("The Factors are: ");

        for (int i=1; i <=a;i++){
            if(a%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
