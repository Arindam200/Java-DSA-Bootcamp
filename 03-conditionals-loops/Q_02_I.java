import java.util.Scanner;

public class Q_02_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the unit of current: ");
        int x = in.nextInt();
        ElectricBill(x);
    }
    static void ElectricBill(int a){
        double bill = 0;
        if (a<100){
             bill = a*1.20;            
        } else if (a<300) {
             bill = 100*1.20 + (a-100)*2;
            
        } else if (a>300) {
            bill = 100*1.20+200*2+(a-300)*3;
        }
        System.out.print("The BIll is "+bill);
    }
}
