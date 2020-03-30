import edu.princeton.cs.algs4.*;

public class Solution_1_1_33 {

    public static double dot(double[] x, double[] y) throws Exception {
        double a = 0;
        if (x.length != y.length) {
            throw new Exception("x.length should equal y.length");
        }
        for (int i = 0; i < x.length; i++) {
            a += x[i] * y[i];
        }
        return a;
    }

    public static double[][] mult(double[][] a, double[][] b) throws Exception {
        int M = a.length;
        int N = a[0].length;

        int P = b[0].length;

        if (N != b.length) {
            throw new Exception("a.columnSize should equal b.rowSize");
        }

        double[][] c = new double[M][P];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

    public static double[][] transpose(double[][] a) {
        int M = a.length;
        int N = a[0].length;

        double[][] b = new double[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                b[i][j] = a[j][i];
            }
        }

        return b;
    }

    public static double[] mult(double[][] a, double[] b) throws Exception {
        int M = a.length;
        int N = a[0].length;
        if (N != b.length) {
            throw new Exception("a.columnSize should equal b.length");
        }

        double[] c = new double[M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                c[i] += a[i][j] * b[j];
            }
        }

        return c;
    }

    public static double[] mult(double[] a, double[][] b) throws Exception {
        int N = a.length;
        int P = b[0].length;
        if (N != b.length) {
            throw new Exception("a.length should equal b.rowSize");
        }

        double[] c = new double[P];

        for (int i = 0; i < P; i++) {
            for (int j = 0; j < N; j++) {
                c[i] += a[i] * b[j][i];
            }
        }

        return c;
    }

    public static void main(String[] args) {
        double[][] a = new double[5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = StdRandom.uniform();
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("\t%.4f", a[i][j]);
                ;
            }
            System.out.print("\n");
        }

        a = transpose(a);

        System.out.println("Result:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("\t%.4f", a[i][j]);
                ;
            }
            System.out.print("\n");
        }

    }
}
