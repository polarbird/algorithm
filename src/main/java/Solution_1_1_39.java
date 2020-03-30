import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class Solution_1_1_39 {

    private static int M = 1000000;//定义随机数范围6位

    public static int[] RandomArray(int N) {
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(M);//生成随即数组
        }
        return a;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int T = 10;
        for (int i = 1000; i <= 1000000; i = i * 10) {
            StdOut.print("i= " + i + ":   ");
            int cnt = 0;
            for (int j = 0; j < T; j++) {

                int[] a = RandomArray(i);
                Arrays.sort(a);
                int[] b = RandomArray(i);
                Arrays.sort(b);
                for (int k = 0; k < i; k++) {
                    if (BinarySearch.rank(b[k], a) != -1)//调用二分查找
                        cnt++;
                }
            }
            StdOut.println("avergae times: " + cnt / T);
        }
    }

}
