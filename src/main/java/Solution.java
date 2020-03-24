import java.util.ArrayList;
import java.util.Arrays;
public class Solution {

    static int MAX = 9;

    public String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> ans = new ArrayList<>();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        return ans;

    }
}
