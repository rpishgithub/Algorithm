import jdk.nashorn.internal.ir.WhileNode;

public class Solution {

    public ListNode addTwoNumbers(ListNode linkedList1, ListNode linkedList2) {
        ListNode dummyNode = new ListNode(0);
        ListNode current = dummyNode;
        ListNode p = linkedList1;
        ListNode q = linkedList2;
        int carry = 0;
        while (p != null || q != null) {
            int x = p == null ? 0 : p.val;
            int y = q == null ? 0 : q.val;
            int sum = carry + x + y;
            carry = sum / 10;
            ListNode newDigit = new ListNode(sum % 10);
            current.next = newDigit;
            current = newDigit;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            ListNode newDigit = new ListNode(carry);
            current.next = newDigit;
        }
        return dummyNode.next;
    }

    public ListNode processInput(String string) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        String[] nums = string.split(" -> ");
        for (String num : nums) {
            ListNode newDigit = new ListNode(num.replace("(","").replace(" ","").toCharArray()[0] - '0');
            current.next = newDigit;
            current = current.next;
        }
        return dummyHead.next;
    }

    public void output(ListNode listNode) {
        ListNode current=listNode;
        while (current.next != null) {
            System.out.printf("%d -> ", current.val);
            current = current.next;
        }
        System.out.println(current.val);
    }
}
