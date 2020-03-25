import java.util.*;

public class Application {

    public static void main(String[] args) {
        Solution012 solution = new Solution012();

        int[] input = {4, 5, 1, 6, 2, 7, 3, 8};
        int k = 4;
        ArrayList<Integer> list = solution.GetLeastNumbers_Solution(input,k);

        for (int item : list) {
            System.out.println(item);
        }

    }

}
