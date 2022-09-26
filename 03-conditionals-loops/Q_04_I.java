import java.util.Scanner;

public class Q_04_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the MarkedPrice: ");
        double markedprice = in.nextDouble();
        double dis = 25;
        double s = markedprice - dis;
        double amount = s*markedprice/100;


        System.out.print("amount of Markedprice: "+markedprice);
        System.out.print("amount of Discount : "+dis);
        System.out.print("amount after Discount: "+amount);
    }
}
