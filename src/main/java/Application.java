import java.util.*;

public class Application {

    public static void main(String[] args) {
        int[][] a = new int[5][4];
        System.out.println(getString(100));
    }

    public static String getString(int m) {
        return Integer.toBinaryString(m);
    }

}
