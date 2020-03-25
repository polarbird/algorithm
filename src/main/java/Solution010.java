/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */

import java.util.ArrayList;
import java.util.TreeSet;

public class Solution010 {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> ans = new ArrayList<>();

        if (str == null || str.length() == 0) {
            return ans;
        }

        char[] chars = str.toCharArray();

        TreeSet<String> temp = new TreeSet<>();

        Permutation(chars, 0, temp);

        ans.addAll(temp);

        return ans;
    }

    public static void Permutation(char[] chars, int begin, TreeSet<String> result) {
        if (chars == null || chars.length == 0 || begin < 0 || begin > chars.length - 1) {
            return;
        }
        if (begin == chars.length - 1) {
            result.add(String.valueOf(chars));
        } else {
            for (int i = begin; i <= chars.length - 1; i++) {
                swap(chars, begin, i);

                Permutation(chars, begin + 1, result);

                swap(chars, begin, i);
            }
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
