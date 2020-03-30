import edu.princeton.cs.algs4.*;

public class Solution_1_1_36 {

    public static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = i+StdRandom.uniform(N-i);  // between i and N-1
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void shuffleTerrible(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = StdRandom.uniform(N);     // between i and N-1
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }



    public static void main(String[] args) {
        int M = 5;
        int N = 10000;

        int[] a = new int[M];
        int[][] c = new int[N][M];
        int[][] b = new int[M][M];
        int s = N;
        while (s > 0) {

            for (int i = 0; i < M; i++) {
                a[i] = i;
            }
            shuffleTerrible(a);
            for (int i = 0; i < M; i++) {

                c[N - s][i] = a[i];
            }
            s--;
        }
        StdOut.println("c");
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {

                StdOut.print(c[j][i] + " ");
            }
            StdOut.println(" ");
        }
        StdOut.println("daluan b[m][m]");
        for (int k = 0; k < M; k++) {
            for (int i = 0; i < M; i++) {
                int num = 0;
                for (int j = 0; j < N; j++) {

                    if (c[j][i] == k)
                        num++;
                }
                b[k][i] = num;
//                StdOut.print("i= "+i+"  ");
                StdOut.print(b[k][i] + " ");
            }
            StdOut.println("  k=" + k);
        }


    }
}
