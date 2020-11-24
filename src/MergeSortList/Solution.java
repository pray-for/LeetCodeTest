package MergeSortList;

public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode a = l1;
        ListNode b = l2;
        ListNode c = l3;
        while (a != null && b != null){
            if (a.val <= b.val){
                c.next = a;
                c = a;
                a = a.next;
            }else {
                c.next = b;
                c = b;
                b = b.next;
            }
        }
        while (a == null && b != null){
            c.next = b;
            c = b;
            b = b.next;
        }
        while (a != null && b == null){
            c.next = a;
            c = a;
            a = a.next;
        }
        return l3.next;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 1;
        l1.next.val = 2;
        l1.next.next.val = 4;
        ListNode l2 = new ListNode();
        l2.val = 1;
        l2.next.val = 3;
        l2.next.next.val = 4;
        ListNode l3;
        l3 = mergeTwoLists(l1, l2);
        ListNode p = l3;
        while (p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
    }
}

