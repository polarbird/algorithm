import edu.princeton.cs.algs4.*;

public class Solution_1_1_32 {

    public static void segment(int N, double l, double r, double[] a) {
        if (N == 0) return;
        double rate = (r - l) / N;
        for (int i = 0; i <= N; i++) {
            a[i] = l + rate * i;
        }
    }

    public static void histogram(double l, double r, double[] a, double[] b) {
        int[] c = new int[a.length - 1];
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < a.length - 1; j++) {
                if (b[i] >= a[j] && b[i] < a[j + 1]) {
                    c[j]++;
                    continue;
                }
            }
        int N = c.length;
        StdDraw.setXscale(0, (r - l) * 1.2);
        StdDraw.setYscale(0, b.length / N * 1.5);
        for (int i = 0; i < N; i++) {
            double x = l + (r - l) / N * i+ 0.05;
            double y = c[i] / 2.0;
            double rw = (r - l) / (2 * N);
            double rh = c[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
            StdOut.print(c[i] + " ");
        }
    }

    public static void main(String[] args) {
        int N = 10;
        double l = 2;
        double r = 10;

        double[] a = new double[N + 1];//记录分段的节点
        double[] b = new double[N * N * N];//随机产生一个数组，作为输入数字。
        for (int i = 0; i < b.length; i++) {
            b[i] = StdRandom.uniform(l, r);
        }

        segment(N, l, r, a);

        histogram(l, r, a, b);
    }
}
