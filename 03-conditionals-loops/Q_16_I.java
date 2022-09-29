import java.util.Scanner;

public class Q_16_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String a = in.nextLine();
        String rev = "";
        int i = a.length()-1;
        while (i>=0){
            rev += a.charAt(i);
            i--;
        }
        System.out.print("The reverse string is : "+rev);
    }
}
