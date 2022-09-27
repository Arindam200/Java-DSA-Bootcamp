import java.util.Scanner;

public class Q_09_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number of matches: ");
        int matches = in.nextInt();
        System.out.print("Enter the Number of Innings: ");
        int innings = in.nextInt();
        System.out.print("Enter the Total Runs: ");
        int totalRuns = in.nextInt();
        System.out.print("Enter the Number of Not outs: ");
        int notout =in.nextInt();


        double avg = totalRuns/(innings-notout);
        System.out.print("The Batting average is :  "+ avg);
    }
}
