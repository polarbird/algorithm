/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */

import java.util.ArrayList;
import java.util.Stack;

public class Solution003 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }
}
