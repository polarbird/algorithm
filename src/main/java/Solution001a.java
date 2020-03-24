/**
 * 排列询问
 * 牛妹有一个长度为n的排列p，她有q个询问。
 * 每个询问包含l1，r1，l2，r2.
 * 她想知道从[l1,r1]中选取x，[l2,r2]中选取y,
 * 有多少组(x,y)满足min(x,y)==gcd(x,y)?
 */

public class Solution001a {


    /**
     * @param n  int整型 n
     * @param q  int整型 q
     * @param p  int整型一维数组 p
     * @param l1 int整型一维数组 l1
     * @param r1 int整型一维数组 r1
     * @param l2 int整型一维数组 l2
     * @param r2 int整型一维数组 r2
     * @return int整型一维数组
     */
    public int[] PermutationQuery(int n, int q, int[] p, int[] l1, int[] r1, int[] l2, int[] r2) {
        // write code here

        int[] answer = new int[q];

        for (int i = 0; i < q; i++) {
            int xMin = p[l1[i]];
            int xMax = p[r1[i]];
            int yMin = p[l2[i]];
            int yMax = p[r2[i]];

            answer[i] = countMinIsEqualGcd(xMin, xMax, yMin, yMax);
        }
        return answer;
    }

    public static int countMinIsEqualGcd(int xMin, int xMax, int yMin, int yMax) {
        int count = 0;
        if (minIsEqualGcd(xMin, yMin)) count++;
        if (minIsEqualGcd(xMin, yMax)) count++;
        if (minIsEqualGcd(xMax, yMin)) count++;
        if (minIsEqualGcd(xMax, yMax)) count++;

        return count;
    }


    public static boolean minIsEqualGcd(int x, int y) {
        int min = x < y ? x : y;
        int gcd = gcd(x, y);

        return min == gcd;
    }


    public static int gcd(int x, int y) {
        if (x < y) {
            int t = x;
            x = y;
            y = t;
        }

        while (y > 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }

        return x;
    }

    public static void main(String[] args) {
        int n = 6;
        int q = 1;
        int[] p = {1, 2, 3, 4, 5, 6};
        int[] l1 = {0};
        int[] r1 = {1};
        int[] l2 = {2};
        int[] r2 = {3};

        int y = 30;

        Solution001a solution = new Solution001a();

        int[] a = solution.PermutationQuery(n, q, p, l1, r1, l2, r2);

        for(int item : a)
            System.out.println(item);


    }
}
