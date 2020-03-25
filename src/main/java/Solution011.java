/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 */

import java.util.HashMap;

public class Solution011 {

    public int MoreThanHalfNum_Solution(int[] array) {
        int count = array.length;
        if (array == null || count == 0) {
            return 0;

        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < count; i++) {
            int key = array[i];
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, 1);
            } else {
                int value = hashMap.get(key);
                value++;
                hashMap.put(key, value);
            }
        }

        int half = count / 2;

        for (int key : hashMap.keySet()) {
            int value = hashMap.get(key);
            if (value > half) {
                return key;
            }
        }

        return 0;
    }
}
