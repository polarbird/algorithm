import edu.princeton.cs.algs4.StdOut;

public class Merge {

    private static Comparable[] aux;
    private static int count = 0;

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        count++;
        StdOut.println(count + ". Merge(" + lo + "," + mid + "," + hi + ")");
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 14, 15, 16, 6, 7, 8, 9, 10,
            11, 12, 13, 24, 25, 26, 34, 35, 36, 27,
            21, 22, 23, 17, 3, 4, 5, 28, 29, 30,
            31, 32, 33, 37, 38, 39, 18, 19, 20};
        sort(a);
//        for (int c : a) {
//            System.out.println(c);
//        }
    }
}
