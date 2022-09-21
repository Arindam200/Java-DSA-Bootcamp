import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("Enter the first number: ");
            int num1 = a.nextInt();

            System.out.print("Enter the second Number: ");
            int num2 = a.nextInt();

            System.out.print("Enter the Operation[+,-,*,/]:");
            char op = a.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                if (op == '+'){
                    ans = num1+num2;
                }
                if (op == '-'){
                    ans= num1 - num2;
                }
                if (op == '*'){
                    ans=num1*num2;
                }
                if (op == '/'){
                    if (num2!=0) {
                        ans = num1 / num2;
                    }else {
                        System.out.print("Second Number can't be zero");
                    }
                }
                
            } else if (op=='x'|| op == 'X') {
                break;
            }else {
                System.out.print("Invalid Operation");
            }
            System.out.println("The Final answer is : " + ans);
        }


    }
}
