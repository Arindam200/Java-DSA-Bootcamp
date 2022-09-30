import java.util.Scanner;

public class Q_21_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        String a =in.next();
        VOWELCHECK(a);
    }
    static  void VOWELCHECK(String a){
        if(a=="a" ||a=="e" ||a=="i" ||a=="o" ||a=="u" ){
            System.out.print("The word is vowel");
        }else{
            System.out.print("The word is consonant");
        }

    }
}
