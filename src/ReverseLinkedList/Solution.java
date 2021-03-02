package ReverseLinkedList;

import ReverseLinkedList.ListNode;

public class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode p;
        ListNode q;
        p = head.next;
        head.next = null;
        while (p != null){
            q = p;
            p = p.next;
            q.next = head.next;
            head.next = q;
        }
        return head;
    }


    public static void printList(ListNode L){
        ListNode p = L;
        System.out.println("输出链表内容为：");
        while (p.next != null){
            System.out.print(p.next.val + " ");
            p = p.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode result;
        l1.next = null;
        
    }
}
