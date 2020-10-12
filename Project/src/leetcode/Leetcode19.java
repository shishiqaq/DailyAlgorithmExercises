package leetcode;

public class Leetcode19 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0), first = head;
        node.next = head;
        int l = 0;
        while(first != null){
            first = first.next;
            l++;
        }
        l -= n;
        first = node;
        while(l-- > 0){
            first = first.next;
        }
        first.next = first.next.next;
        
        return node.next;
    }
}
