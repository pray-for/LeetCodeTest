package ReverseLinkedList;

public class ListNode {
    int val;
    ReverseLinkedList.ListNode next;
    ListNode() {
    }
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ReverseLinkedList.ListNode next){
        this.val = val;
        this.next = next;
    }
}
