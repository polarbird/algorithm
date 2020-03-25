/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution012 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        if (k > input.length || k <= 0) {
            return ans;
        }

//        PriorityQueue<Integer> queue = new PriorityQueue<>();

        PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < k; i++) {
            queue.offer(input[i]);
        }

//        for (int j = k; j < input.length; j++) {
//            int max = queue.peek();
//            if (max > input[j]) {
//                queue.poll();
//                queue.offer(input[j]);
//            }
//        }

        for (Integer item : queue) {
            ans.add(item);
        }

        return ans;
    }
}
