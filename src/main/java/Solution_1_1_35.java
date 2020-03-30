import edu.princeton.cs.algs4.*;

import java.math.BigInteger;

public class Solution_1_1_35 {

    public static int SIDES = 6;

    public static double[] compute() {
        double[] dist = new double[2 * SIDES + 1];

        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i + j] += 1.0;
            }
        }

        for (int k = 2; k <= 2 * SIDES; k++) {
            dist[k] /= 36.0;
        }

        return dist;
    }

    public static double[] simulate(int N) {
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 0; i < N; i++) {
            int n = 1 + StdRandom.uniform(SIDES);
            int m = 1 + StdRandom.uniform(SIDES);
            dist[n + m] += 1.0;
        }
        for (int k = 2; k <= 2 * SIDES; k++) {
            dist[k] = dist[k] / N;
        }
        return dist;
    }

    public static void match(int N) {
        boolean isMatch = true;
        double[] a = compute();

        for (int n = N; isMatch; n = n + n / 10) {
            double[] b = simulate(n);
            int cnt = 0;
            for (int k = 2; k <= 2 * SIDES; k++) {
                if (Math.abs(a[k] - b[k]) > 0.0001) {
                    isMatch = true;
                    continue;
                } else {
                    cnt++;
                }
                if (cnt == 11) {
                    isMatch = false;
                }
            }
            StdOut.println("n=" + n + "  cnt=" + cnt);
            print(b);
        }

    }

    public static void print(double[] a) {
        for (int k = 2; k <= 2 * SIDES; k++) {
            StdOut.print("k=" + k + " " + a[k] + " ");
            if ((k - 1) % 6 == 0)
                StdOut.println(" ");
        }
        StdOut.println(" ");

    }


    public static void main(String[] args) {
        int N = 10000000;
        match(N);
    }
}
