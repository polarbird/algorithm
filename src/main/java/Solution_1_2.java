import edu.princeton.cs.algs4.*;

public class Solution_1_2 {

    public static void main(String[] args) {
        String a = "hello world. Wuha汉n";
        int dot = a.indexOf(".");
        String base = a.substring(dot,a.length()-2);
        System.out.println(base);
    }
}
