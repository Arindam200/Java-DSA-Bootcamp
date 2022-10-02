public class Q_25_I {
    public static void main(String[] args) {
        String month = "august";

    }
    static void NumofEvenDays(String y){
        if (y=="january"||y=="march"||y=="may"|| y== "august"||y=="july"||y == "october"||y == "december"){
            int d = 31;
            int day =0;
            for (int i = 0;i<=d;i++){
                if(i%2==0){
                    day +=1;
                    System.out.print("Number of even days is"+day);
                }
            }
        }else if(y=="fabruary") {
            int d = 28;
            int day = 0;
            for (int i = 0; i <= d; i++) {
                if (i % 2 == 0) {
                    day += 1;
                    System.out.print("Number of even days is"+day);
                }

            }
        }else {
            int d = 30;
            int day = 0;
            for (int i = 0; i <= d; i++) {
                if (i % 2 == 0) {
                    day += 1;
                    System.out.print("Number of even days is"+day);
                }
            }
        }
    }
}
