import java.util.Scanner;

public class Q_23_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int a = in.nextInt();
        LeapYear(a);

    }
    static void LeapYear(int x){
        if(x%4==0){
            System.out.print("This is a Leap Year.");
        }else {
            System.out.print("This is not a Leap Year.");
        }
    }
}
