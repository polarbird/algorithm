import java.util.*;

public class Main {

//    public static String order(int[][] t) {
//        ArrayList list = new ArrayList<Integer>();
//
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < 2; j++) {
//                int a = t[i][0];
//                int b = t[i][1];
//                int from = list.indexOf(a);
//                int to = list.indexOf(b);
//                if (from == -1 && to == -1) {
//                    list.add(a);
//                    list.add(b);
//                } else if(from == -1 && to != -1) {
//                    list.add(to - 1, a);
//                } else if(from != -1 && to == -1) {
//                    list.add(from + 1, b);
//                } else if (from != -1 && to <= from) {
//                    return "null";
//                }
//            }
//        }
//
//        return list.toString();
//
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> a = new Vector<Integer>();
//        ArrayList a = new ArrayList<Integer>();
        while (sc.hasNextLine()) {
            a.add(sc.nextInt());
        }
        int m = a.size() / 2;
//        int[][] t = new int[m][2];
//        for (int i = 0; i < m; i++) {
//            t[i][0] = a.get(i * 2);
//            t[i][1] = a.get(i * 2 + 1);
//        }

        System.out.println("a.size() = " + a.size());
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < 2; j++) {
//                if (j == 1) {
//                    System.out.println(t[i][j] + " ");
//                } else {
//                    System.out.print(t[i][j] + " ");
//                }
//            }
//        }
    }
}
