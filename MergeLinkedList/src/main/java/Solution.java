public class Solution {
    //Simplest Solution:Recursive
    //However it will take a large amount of stack memory.To solve this,we should use next method.
    public static ListNode mergeLinedList(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null) {
            return listNode2;
        }
        if (listNode2 == null) {
            return listNode1;
        }
        if (listNode1.val <= listNode2.val) {
            listNode1.next = mergeLinedList(listNode1.next, listNode2);
            return listNode1;
        } else {
            listNode2.next = mergeLinedList(listNode1, listNode2.next);
            return listNode2;
        }

    }

    public static ListNode mergeLinkedList(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null) {
            return listNode2;
        }
        if (listNode2 == null) {
            return listNode1;
        }
        ListNode mergeHead = null;
        ListNode current = null;
        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val <= listNode2.val) {
                if (mergeHead == null) {
                    mergeHead = current = listNode1;
                } else {
                    current.next = listNode1;
                    current = listNode1;
                }
                listNode1 = listNode1.next;
            } else {
                if (mergeHead == null) {
                    mergeHead = current = listNode2;
                } else {
                    current.next = listNode2;
                    current = listNode2;
                }
                listNode2 = listNode2.next;
            }
        }
        if (listNode1 == null) {
            current.next = listNode2;
        } else {
            current.next = listNode1;
        }
        return mergeHead;
    }

}
