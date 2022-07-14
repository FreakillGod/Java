import java.util.Arrays;

public class Maths {
    // sea of erato (for prime number btwn range)
    public static boolean[] findPrimeInRagne(int n) {
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;

        // fill all celss with true
        for (int i = 2; i * i <= n; i++) {

            // starting with the i*2 and adding the mutliple of i
            for (int j = 2 * i; j <= n; j += i) {
                arr[j] = false;
            }
        }
        return arr;
    }

    // EUCLID
    // GCD (greatest common divisor)
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // complete task in modulo
    // 3^5
    public static long fastPower(long a, long b, int n) {
        long res = 1;

        while (b > 0) {
            // b&1 means if last bit will be 0 for even 1 for odd
            if ((b & 1) != 0) {
                res = (res%n * a%n)%n;
            }

            a = (a%n * a%n)%n;
            b = b >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        boolean arr[] = findPrimeInRagne(20);
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + "is" + arr[i]);
        }
        System.out.println(gcd(2, 4));

        System.out.println(fastPower(32423,23,2423423));
    }
}
