public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,4,7,10,10,11,11,11};
        int key = 11;
        System.out.println(rank(key,a));
        System.out.println(count(key,a));
//        System.out.println(binomial(100, 50, 0.25));
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        } else {
            while (mid != 0 && key == a[mid - 1]) {
                mid--;
            }
            return mid;
        }
    }

    public static int count(int key, int[] a) {
        return count(key, a, 0, a.length - 1);
    }

    public static int count(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return 0;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return count(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return count(key, a, mid + 1, hi);
        } else {
            int start = mid;
            int end = mid;
            while (start != 0 && key == a[start - 1]) {
                start--;
            }
            while ((end != a.length - 1) && key == a[end + 1]) {
                end++;
            }
            System.out.println("mid = "+ mid);
            System.out.println("start = "+ start);
            System.out.println("end = "+ end);
            return end - start + 1;
        }
    }
}
