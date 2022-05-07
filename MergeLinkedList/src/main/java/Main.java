public class Main {
    public static void traverseLinkedList(ListNode head) {
        while (head != null) {
            System.out.printf("%d ",head.val);
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(8);
        ListNode listNode9 = new ListNode(9);
        listNode1.next = listNode3;
        listNode3.next = listNode5;
        listNode5.next = listNode7;
        listNode7.next = listNode9;
        listNode2.next = listNode4;
        listNode4.next = listNode6;
        listNode6.next = listNode8;

        traverseLinkedList(listNode1);
        traverseLinkedList(listNode2);
        traverseLinkedList(Solution.mergeLinkedList(listNode1,listNode2));
//        traverseLinkedList(listNode1);
//        traverseLinkedList(listNode2);
    }
}
