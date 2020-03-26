import java.math.BigInteger;

public class Fibonacci {

    public static String getFibonacci(int n) {
        int[][] a = new int[n + 1][30];
        a[0][29] = 0;
        a[1][29] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 29; j >= 0; j--) {
                int sum = a[i - 2][j] + a[i - 1][j];
                if (sum >= 10) {
                    a[i][j - 1] += 1;
                }
                a[i][j] = a[i][j] + sum % 10;
                if (a[i][j] >= 10) {
                    a[i][j - 1] += 1;
                    a[i][j] = a[i][j] % 10;
                }
            }
        }

        String str = "";
        int j = 0;
        while (a[n][j] == 0) {
            j++;
        }
        for (int k = j; k < 30; k++) {
            str = str + a[n][k];
        }

        return str;
    }

    public static String getFibonacciByBigInteger(int n) {
        BigInteger[] a = new BigInteger[n + 1];
        a[0] = new BigInteger("0");
        a[1] = new BigInteger("1");

        for (int i = 2; i < n + 1; i++) {
            a[i] = a[i - 1].add(a[i - 2]);
        }

        return a[n].toString();
    }

    public static void main(String[] args) {

        System.out.println(getFibonacciByBigInteger(100));
    }
}
