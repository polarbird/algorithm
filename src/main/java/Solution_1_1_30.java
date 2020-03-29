public class Solution_1_1_30 {

    public static void main(String[] args) {
        int N = 10;

        boolean[][] a = generateBooleanArray(N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("\t%s", a[i][j]);
            }
            System.out.print("\n");
        }

    }

    public static boolean[][] generateBooleanArray(int N) {
        boolean[][] a = new boolean[N][N];
        if (N <= 0) {
            return a;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || j == 0) {
                    a[i][j] = false;
                } else if (i == 1 || j == 1) {
                    a[i][j] = true;
                } else if (i == j) {
                    a[i][j] = false;
                } else if (i > j) {
                    a[i][j] = a[j][i];
                } else {
                    a[i][j] = (gcd(i, j) == 1);
                }

            }
        }

        return a;
    }

//    public static int gcd(int x, int y) {
//
//        if (y % x == 0) {
//            return x;
//        }
//        return gcd(y % x, x);
//    }

    public static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (a - b != 0) {
            int c = a - b;
            if (b < c) {
                a = c;
            } else {
                a = b;
                b = c;
            }
        }

        return a;
    }

}
