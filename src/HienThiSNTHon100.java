public class HienThiSNTHon100 {
    public static void main(String[] args) {
        int n = 100;

        System.out.print("Prime numbers smaller than " + n + " are: ");

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
