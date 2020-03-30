public class Solution_1_1_38 {

    public static int bruteForceSearch(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                return i;
            }
        }

        return -1;
    }
}
