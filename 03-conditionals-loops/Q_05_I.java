import java.util.Scanner;

public class Q_05_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the x coordinate of the first point: ");
        int x1 = in.nextInt();
        System.out.print("Enter the y coordinate of the first point: ");
        int y1 = in.nextInt();
        System.out.print("Enter the x coordinate of the second point: ");
        int x2 = in.nextInt();
        System.out.print("Enter the y coordinate of the second point: ");
        int y2 = in.nextInt();

        double dis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.print("The distance between the two points is : "+dis);
    }
}
