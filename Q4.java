public class Q4 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
