import java.util.Scanner;

public class Q_07_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of side: ");
        int a= in.nextInt();
        Area(a);
    }
    static void Area(int x){
        double b =  (Math.sqrt(3)*(x*x)/4);
        System.out.print("The Area is : "+ b);
    }
}
