public class Q_01 {
    public static int[] main(int[] args) {
        int[] arr = new int[args.length];
        for (int i=0;i< args.length;i++){
            arr[i] = args[args[i]];
        }
        return arr;
    }
}
